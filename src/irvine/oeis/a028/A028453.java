package irvine.oeis.a028;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A028453 Number of perfect matchings in graph P_{3} X P_{4} X P_{n}.
 * @author Steven Kotlarz
 * @author Sean A. Irvine (Java port)
 */
public class A028453 extends Sequence0 {

  // See https://oeis.org/A028453/a028453.py.txt

  private final int mR;
  private final int mC;
  private final int mV;
  private final List<Long> mStates = new ArrayList<>();
  private final Map<Long, Integer> mIndex = new HashMap<>();
  private final Map<Integer, Map<Integer, Integer>> mTransitions = new HashMap<>();

  private Z[] mVec;
  private int mN = -1;

  protected A028453(final int r, final int c) {
    mR = r;
    mC = c;
    mV = r * c;
    if (mV >= Long.SIZE) {
      throw new UnsupportedOperationException();
    }
    buildStates();
    buildTransitions();
    final int s0 = mIndex.get(0L);
    mVec = new Z[mStates.size()];
    Arrays.fill(mVec, Z.ZERO);
    mVec[s0] = Z.ONE;
  }

  /** Construct the sequence. */
  public A028453() {
    this(3, 4);
  }

  private boolean isBalanced(final long m) {
    int b = 0;
    int w = 0;
    for (int i = 0; i < mV; ++i) {
      if (((m >>> i) & 1) != 0) {
        final int r = i / mC;
        final int c = i % mC;
        if (((r + c) & 1) == 0) {
          ++b;
        } else {
          ++w;
        }
      }
    }
    return b == w;
  }

  private void buildStates() {
    for (long m = 0; m < (1L << mV); ++m) {
      if (isBalanced(m)) {
        mIndex.put(m, mStates.size());
        mStates.add(m);
      }
    }
  }

  private void match(final long inc, final int p, final long used, final long out, final Map<Integer, Integer> row) {
    if (p == mV) {
      final Integer j = mIndex.get(out);
      if (j != null) {
        row.merge(j, 1, Integer::sum);
      }
      return;
    }
    if (((inc >>> p) & 1) != 0 || ((used >>> p) & 1) != 0) {
      match(inc, p + 1, used, out, row);
      return;
    }

    // single
    match(inc, p + 1, used | (1L << p), out | (1L << p), row);

    final int r = p / mC;
    final int c = p % mC;

    // horizontal
    if (c + 1 < mC) {
      final int nb = r * mC + c + 1;
      if (((inc >>> nb) & 1) == 0 && ((used >>> nb) & 1) == 0) {
        match(inc, p + 1, used | (1L << p) | (1L << nb), out, row);
      }
    }

    // vertical
    if (r + 1 < mR) {
      final int nb = (r + 1) * mC + c;
      if (((inc >>> nb) & 1) == 0 && ((used >>> nb) & 1) == 0) {
        match(inc, p + 1, used | (1L << p) | (1L << nb), out, row);
      }
    }
  }

  private void buildTransitions() {
    for (int i = 0; i < mStates.size(); ++i) {
      final long si = mStates.get(i);
      final Map<Integer, Integer> row = new HashMap<>();
      match(si, 0, 0, 0, row);
      if (!row.isEmpty()) {
        mTransitions.put(i, row);
      }
    }
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Z[] nv = new Z[mVec.length];
    Arrays.fill(nv, Z.ZERO);
    for (int i = 0; i < mVec.length; ++i) {
      final Z vi = mVec[i];
      if (!vi.isZero()) {
        final Map<Integer, Integer> row = mTransitions.get(i);
        if (row != null) {
          for (final Map.Entry<Integer, Integer> e : row.entrySet()) {
            nv[e.getKey()] = nv[e.getKey()].add(vi.multiply(e.getValue()));
          }
        }
      }
    }
    mVec = nv;
    return mVec[mIndex.get(0L)];
  }
}
