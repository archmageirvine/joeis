package irvine.math.turing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/** Check ordered FRACTRAN steps over affine families of counter values. */
final class FractranMacro {

  static final class Affine {
    private final long mA;
    private final long mK;
    private final long mConstant;

    Affine(final long a, final long k, final long constant) {
      mA = a;
      mK = k;
      mConstant = constant;
    }

    Affine add(final long n) {
      return new Affine(mA, mK, Math.addExact(mConstant, n));
    }

    Affine add(final Affine b) {
      return new Affine(Math.addExact(mA, b.mA), Math.addExact(mK, b.mK), Math.addExact(mConstant, b.mConstant));
    }

    Affine multiply(final long factor) {
      return new Affine(Math.multiplyExact(mA, factor), Math.multiplyExact(mK, factor), Math.multiplyExact(mConstant, factor));
    }

    boolean atLeast(final long n) {
      return mA >= 0 && mK >= 0 && mConstant >= n;
    }

    boolean atMost(final long n) {
      return mA <= 0 && mK <= 0 && mConstant <= n;
    }

    Affine floorDivide(final int d) {
      require(d > 0 && mA % d == 0 && mK % d == 0, "Split the residue classes before division");
      return new Affine(mA / d, mK / d, Math.floorDiv(mConstant, d));
    }

    private long value(final int a, final int k) {
      return Math.addExact(Math.addExact(Math.multiplyExact(mA, a), Math.multiplyExact(mK, k)), mConstant);
    }

    boolean residue(final int m, final int r) {
      return mA % m == 0 && mK % m == 0 && Math.floorMod(mConstant, m) == r;
    }

    private Affine split(final boolean first, final boolean zero) {
      if (zero) {
        return first ? new Affine(0, mK, mConstant) : new Affine(mA, 0, mConstant);
      }
      return add(first ? mA : mK);
    }

    @Override
    public String toString() {
      return mA + " a + " + mK + " k + " + mConstant;
    }
  }

  static final Affine ZERO = constant(0);
  static final Affine A = new Affine(1, 0, 0);
  static final Affine K = new Affine(0, 1, 0);

  static Affine constant(final long n) {
    return new Affine(0, 0, n);
  }

  static void require(final boolean ok, final String why) {
    if (!ok) {
      throw new IllegalStateException(why);
    }
  }

  private final int[][] mRules;
  private final Affine[] mState;

  FractranMacro(final int[][] rules, final Affine... start) {
    mRules = rules;
    mState = start.clone();
    require(rules.length != 0 && Arrays.stream(rules).allMatch(r -> r.length == start.length), "Bad transition table");
    require(Arrays.stream(start).allMatch(a -> a.atLeast(0)), "Negative counter in starting family");
  }

  Affine get(final int coordinate) {
    return mState[coordinate];
  }

  void zeros(final int... coordinates) {
    for (final int k : coordinates) {
      require(get(k).atLeast(0) && get(k).atMost(0), "Nonzero counter " + k);
    }
  }

  private boolean enabled(final int rule) {
    for (int i = 0; i < mState.length; ++i) {
      if (!mState[i].atLeast(-(long) mRules[rule][i])) {
        return false;
      }
    }
    return true;
  }

  private boolean blocked(final int rule) {
    for (int i = 0; i < mState.length; ++i) {
      if (mState[i].atMost(-(long) mRules[rule][i] - 1)) {
        return true;
      }
    }
    return false;
  }

  void advance(final int steps) {
    for (int j = 0; j < steps; ++j) {
      int r = 0;
      while (r < mRules.length && blocked(r)) {
        ++r;
      }
      require(r < mRules.length && enabled(r), "A first rule must exist for every represented state");
      for (int k = 0; k < mState.length; ++k) {
        mState[k] = mState[k].add(mRules[r][k]);
      }
    }
  }

  private int[] probe(final int length) {
    final int[] y = new int[mState.length];
    for (int i = 0; i < y.length; ++i) {
      y[i] = Math.toIntExact(mState[i].value(5, 27));
    }
    final int[] trace = new int[length];
    for (int step = 0; step < length; ++step) {
      int chosen = -1;
      for (int r = 0; r < mRules.length; ++r) {
        boolean legal = true;
        for (int i = 0; i < y.length; ++i) {
          legal &= (long) y[i] + mRules[r][i] >= 0;
        }
        if (legal) {
          chosen = r;
          break;
        }
      }
      if (chosen < 0) {
        return Arrays.copyOf(trace, step);
      }
      trace[step] = chosen;
      for (int i = 0; i < y.length; ++i) {
        y[i] = Math.addExact(y[i], mRules[chosen][i]);
      }
    }
    return trace;
  }

  private static void propose(final List<Affine> budgets, final Affine allowance, final int step) {
    if (allowance.mA % step == 0 && allowance.mK % step == 0) {
      final Affine n = allowance.floorDivide(step).add(1);
      if (n.atLeast(1) && n.value(5, 27) > 1) {
        budgets.add(n);
      }
    }
  }

  private boolean accelerate(final int[] word) {
    final int[] drift = new int[mState.length];
    for (final int r : word) {
      for (int i = 0; i < drift.length; ++i) {
        drift[i] += mRules[r][i];
      }
    }
    final int[] prefix = new int[mState.length];
    final List<Affine> budgets = new ArrayList<>();
    for (final int r : word) {
      for (int i = 0; i < drift.length; ++i) {
        if (drift[i] < 0) {
          propose(budgets, mState[i].add((long) prefix[i] + mRules[r][i]), -drift[i]);
        }
      }
      for (int prior = 0; prior < r; ++prior) {
        for (int i = 0; i < drift.length; ++i) {
          if (drift[i] > 0) {
            propose(budgets, mState[i].add((long) prefix[i] + mRules[prior][i] + 1).multiply(-1), drift[i]);
          }
        }
      }
      for (int i = 0; i < drift.length; ++i) {
        prefix[i] += mRules[r][i];
      }
    }
    budgets.sort(Comparator.comparingLong((Affine n) -> n.value(5, 27)).reversed());
    for (final Affine n : budgets) {
      try {
        repeat(n, word);
        return true;
      } catch (final IllegalStateException e) {
        // Failed candidates leave the state unchanged. They prove nothing.
      }
    }
    return false;
  }

  // Concrete samples only suggest an action word. repeat() independently
  // checks that word for every parameter value before changing the state.
  boolean findsReturn(final Predicate<FractranMacro> inside) {
    return findsReturn(inside, false, 0, new int[] {1600});
  }

  private FractranMacro split(final boolean first, final boolean zero) {
    return new FractranMacro(mRules, Arrays.stream(mState).map(v -> v.split(first, zero)).toArray(Affine[]::new));
  }

  private boolean findsReturn(final Predicate<FractranMacro> inside, final boolean alreadyAdvanced,
                              final int depth, final int[] budget) {
    boolean moved = alreadyAdvanced;
    for (int n = 0; n < 80; ++n) {
      if (--budget[0] < 0) {
        return false;
      }
      final int[] trace = probe(48);
      boolean advanced = false;
      for (int p = Math.min(24, trace.length / 2); p >= 1 && !advanced; --p) {
        if (Arrays.equals(trace, 0, p, trace, p, 2 * p)) {
          boolean primitive = true;
          for (int q = 1; q < p && primitive; ++q) {
            primitive = p % q != 0 || !Arrays.equals(trace, 0, p - q, trace, q, p);
          }
          advanced = primitive && accelerate(Arrays.copyOf(trace, p));
        }
      }
      if (!advanced) {
        try {
          advance(1);
        } catch (final IllegalStateException e) {
          break;
        }
      }
      moved = true;
      if (inside.test(this)) {
        return true;
      }
    }
    if (depth < 10 && budget[0] > 0) {
      for (final boolean first : new boolean[] {true, false}) {
        if (Arrays.stream(mState).anyMatch(v -> (first ? v.mA : v.mK) != 0)
          && split(first, true).findsReturn(inside, moved, depth + 1, budget)
          && split(first, false).findsReturn(inside, moved, depth + 1, budget)) {
          return true;
        }
      }
    }
    return false;
  }

  // The counter at a fixed word offset is linear in the repetition
  // index. The two endpoints suffice to prove a guard for every copy;
  // the same stationary or varying blocker must work at both endpoints.
  void repeat(final Affine n, final int... word) {
    if (n.atLeast(0) && n.atMost(0)) {
      return;
    }
    require(n.atLeast(1) && word.length != 0, "A repeated block needs at least one copy");
    final int[] drift = new int[mState.length];
    for (final int r : word) {
      for (int i = 0; i < drift.length; ++i) {
        drift[i] = Math.addExact(drift[i], mRules[r][i]);
      }
    }
    final int[] prefix = new int[mState.length];
    final Affine[] intoLast = new Affine[mState.length];
    for (int i = 0; i < mState.length; ++i) {
      intoLast[i] = mState[i].add(n.add(-1).multiply(drift[i]));
    }
    for (final int r : word) {
      for (int i = 0; i < mState.length; ++i) {
        final long need = -(long) prefix[i] - mRules[r][i];
        require(mState[i].atLeast(need) && intoLast[i].atLeast(need), "A repeated rule may be disabled: " + r);
      }
      for (int prior = 0; prior < r; ++prior) {
        boolean excluded = false;
        for (int i = 0; i < mState.length; ++i) {
          final long bound = -(long) prefix[i] - mRules[prior][i] - 1;
          if (mState[i].atMost(bound) && intoLast[i].atMost(bound)) {
            excluded = true;
            break;
          }
        }
        require(excluded, "Earlier rule may interrupt a repeat: " + prior + " before " + r);
      }
      for (int i = 0; i < mState.length; ++i) {
        prefix[i] = Math.addExact(prefix[i], mRules[r][i]);
      }
    }
    for (int i = 0; i < mState.length; ++i) {
      mState[i] = mState[i].add(n.multiply(drift[i]));
    }
  }
}
