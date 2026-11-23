package irvine.math;

import java.util.function.Consumer;
import java.util.function.IntFunction;

import irvine.math.z.Z;

/**
 * Exhaustive small binary-lambda search with a supplied Busy Beaver oracle.
 * @author Gregory Morse
 */
public final class BinaryLambdaOracle {

  private static final int ABS = -1;
  private static final int APP = -2;
  private static final int NUM = -3;

  private BinaryLambdaOracle() { }

  private static final class Term {
    private final int mKind;
    private final Term mLeft;
    private final Term mRight;
    private final Z mNumeral;

    private Term(final int kind, final Term left, final Term right, final Z numeral) {
      mKind = kind;
      mLeft = left;
      mRight = right;
      mNumeral = numeral;
    }
  }

  private static Term var(final int k) {
    return new Term(k, null, null, null);
  }

  private static Term abs(final Term t) {
    return new Term(ABS, t, null, null);
  }

  private static Term app(final Term a, final Term b) {
    return new Term(APP, a, b, null);
  }

  private static void generate(final int size, final int depth, final Consumer<Term> out) {
    if (size < 2) {
      return;
    }
    if (size - 2 < depth) {
      out.accept(var(size - 2));
    }
    generate(size - 2, depth + 1, body -> out.accept(abs(body)));
    for (int i = 2; i <= size - 4; ++i) {
      final int rightSize = size - 2 - i;
      generate(i, depth, l -> generate(rightSize, depth, r -> out.accept(app(l, r))));
    }
  }

  private static Term shift(final Term t, final int cutoff, final int delta) {
    if (t.mKind == APP) {
      return app(shift(t.mLeft, cutoff, delta), shift(t.mRight, cutoff, delta));
    }
    if (t.mKind == ABS) {
      return abs(shift(t.mLeft, cutoff + 1, delta));
    }
    return t.mKind >= cutoff ? var(t.mKind + delta) : t;
  }

  private static Term substitute(final Term t, final Term value, final int binder) {
    if (t.mKind == APP) {
      return app(substitute(t.mLeft, value, binder), substitute(t.mRight, value, binder));
    }
    if (t.mKind == ABS) {
      return abs(substitute(t.mLeft, value, binder + 1));
    }
    if (t.mKind == binder) {
      return shift(value, 0, binder);
    }
    return t.mKind > binder ? var(t.mKind - 1) : t;
  }

  private static boolean closed(final Term t, final int depth) {
    if (t.mKind == APP) {
      return closed(t.mLeft, depth) && closed(t.mRight, depth);
    }
    return t.mKind == ABS ? closed(t.mLeft, depth + 1) : t.mKind < depth;
  }

  private static Z size(final Term t) {
    if (t.mKind == NUM) {
      return t.mNumeral.multiply(5).add(6);
    }
    if (t.mKind == APP) {
      return size(t.mLeft).add(size(t.mRight)).add(2);
    }
    return t.mKind == ABS ? size(t.mLeft).add(2) : Z.valueOf(t.mKind + 2L);
  }

  private static Term expand(final Z numeral) {
    if (numeral.compareTo(Z.valueOf(1000)) > 0) {
      throw new UnsupportedOperationException("Large numeral used as a function");
    }
    final Term f = var(1);
    Term t = var(0);
    for (int k = 0; k < numeral.intValue(); ++k) {
      t = app(f, t);
    }
    return abs(abs(t));
  }

  // Find one leftmost outermost beta/oracle step. An oracle application
  // first normalizes its argument; only closed normal arguments can be
  // queried. Keep Church numerals compressed unless used as functions.
  private static Term step(final Term t, final int depth, final IntFunction<Z> oracle) {
    if (t.mKind == ABS) {
      final Term body = step(t.mLeft, depth + 1, oracle);
      return body == null ? null : abs(body);
    }
    if (t.mKind != APP) {
      return null;
    }
    final Term f = t.mLeft;
    if (f.mKind == ABS) {
      return substitute(f.mLeft, t.mRight, 0);
    }
    if (f.mKind == NUM) {
      return substitute(expand(f.mNumeral).mLeft, t.mRight, 0);
    }
    final Term function = step(f, depth, oracle);
    if (function != null) {
      return app(function, t.mRight);
    }
    final Term argument = step(t.mRight, depth, oracle);
    if (argument != null) {
      return app(f, argument);
    }
    return f.mKind == depth && closed(t.mRight, 0)
      ? new Term(NUM, null, null, oracle.apply(size(t.mRight).intValueExact())) : null;
  }

  /**
   * Enumerate all terms of a given size with at most the one free oracle variable.
   * @param bits binary size
   * @param oracle closed normal-form size to Busy Beaver value
   * @return maximum beta/oracle normal-form size
   */
  public static Z maximum(final int bits, final IntFunction<Z> oracle) {
    if (bits < 1 || bits > 14) {
      throw new UnsupportedOperationException("Only the published finite range is supported");
    }
    final Z[] best = {Z.ZERO};
    generate(bits, 1, term -> {
      Term t = term;
      for (int fuel = 0; fuel < 10_000; ++fuel) {
        final Term next = step(t, 0, oracle);
        if (next == null) {
          best[0] = best[0].max(size(t));
          return;
        }
        t = next;
      }
      throw new IllegalStateException("Oracle normal form not certified");
    });
    return best[0];
  }
}
