package irvine.oeis.a084;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084501 An infinite juggling sequence of three balls: successively larger ground-state 3-ball site swaps listed in lexicographic order.
 * @author Sean A. Irvine
 */
public class A084501 extends Sequence1 {

  // Based on Antti Karttunen, https://oeis.org/A084507/a084507.scm.txt

  static final class Belgthor {
    private final List<int[]> mCache = new ArrayList<>();
    private final int mBalls;
    private final int mType;

    private Belgthor(final int balls, final int type) {
      mBalls = balls;
      mType = type;
    }

    /**
     * Return the next row.
     * @param n throw
     * @return row
     */
    public int[] belgthor(final int n) {
      while (n >= mCache.size()) {
        mCache.add(null);
      }
      final int[] cached = mCache.get(n);
      if (cached != null) {
        return cached;
      }
      final int[] result;
      if (n == 0) {
        result = new int[0]; // (vector)
      } else {
        final int[] prev = belgthor(n - 1).clone();
        int[] tv = nextTestVector(prev, mBalls);
        while (!gs2gs(tv, mBalls, mType)) {
          tv = nextTestVector(tv, mBalls);
        }
        result = tv;
      }
      mCache.set(n, result);
      return result;
    }

    private boolean lastPossible(final int[] tv, int u, final int p, int i) {
      while (true) {
        if (i == p) {
          return true;
        }
        if (tv[i] == u) {
          u = Math.max(u - 2, 0);
          ++i;
        } else {
          return false;
        }
      }
    }

    private int[] nextTestVector(final int[] tv, final int b) {
      final int p = tv.length;

      // If last possible vector -> return new longer vector filled with b
      if (lastPossible(tv, p + b - 1, p, 0)) {
        final int[] res = new int[p + 1];
        for (int i = 0; i <= p; ++i) {
          res[i] = b;
        }
        return res;
      }

      // Odometer-style increment (right to left)
      int i = p - 1;
      int u = b;
      while (true) {
        if (tv[i] == u) {
          // carry: reset to 0 and move left
          tv[i] = 0;
          --i;
          ++u;
        } else {
          // increment and stop
          ++tv[i];
          return tv;
        }
      }
    }

    private boolean gs2gs(final int[] tv, final int b, final int type) {
      final int gs = (1 << b) - 1;
      final int p = tv.length;

      int s = gs;
      int i = 0;

      final Set<Integer> visited = type == 2 ? new HashSet<>() : null;

      while (true) {
        if (i == p) {
          return s == gs;
        }
        final int tt = tv[i];
        // type 1: cannot revisit ground state after start
        if (type == 1 && i > 0 && s == gs) {
          return false;
        }
        // type 2: no repeated states
        if (type == 2 && visited.contains(s)) {
          return false;
        }
        // even state requires zero throw
        if ((s & 1) == 0 && tt != 0) {
          return false;
        }
        // collision check
        if (((s >> tt) & 1) != 0) {
          return false;
        }
        if (type == 2) {
          visited.add(s);
        }
        // state transition
        s = (s + (1 << tt)) >> 1;
        ++i;
      }
    }
  }

  protected final Belgthor mS;
  private int[] mRow = {};
  private int mN = 0;
  private int mM = 0;

  protected A084501(final int type) {
    mS = new Belgthor(3, type);
  }

  /** Construct the sequence. */
  public A084501() {
    this(0);
  }

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mRow = mS.belgthor(++mN);
      mM = 0;
    }
    return Z.valueOf(mRow[mM]);
  }
}
