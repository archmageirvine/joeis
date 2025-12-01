package irvine.oeis.a390;

import java.util.HashMap;

import irvine.math.IntegerUtils;
import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390671 allocated for Alessandro M. Pettinari.
 * @author Sean A. Irvine
 */
public class A390671 extends Sequence1 {

  // We could support up to 2^31 without much difficultly, but MAX_HYPER would need to be increased
  private static final int MAX_BITS = 16;
  private static final int LIMIT = 1 << MAX_BITS;
  private static final int MAX_HYPER = 4;
  private final HashMap<Integer, Integer> mOps = new HashMap<>();
  private int mN = 0;
  private final MemoryFunctionInt3<Long> mH = new MemoryFunctionInt3<>() {
    @Override
    protected Long compute(final int w, final int x, final int y) {
      switch (w) {
        case 0:
          return y + 1L;
        case 1:
          final long sum = (long) x + y;
          return sum <= LIMIT ? sum : null;
        case 2:
          final long prod = (long) x * y;
          return prod <= LIMIT ? prod : null;
        case 3:
          if ((IntegerUtils.log2(x) - 1) * y >= MAX_BITS) {
            return null;
          }
          final Z exp = Z.valueOf(x).pow(y);
          return exp.bitLength() >= MAX_BITS ? null : exp.longValue();
        case 4:
          if (y == 0) {
            return 1L;
          }
          // tetration
          final Z base = Z.valueOf(x);
          Z res = base;
          for (int k = 1; k < y; ++k) {
            if (base.multiply(res.bitLength() - 1).compareTo(MAX_BITS) >= 0) {
              return null;
            }
            res = base.pow(res);
          }
          return res.bitLength() >= MAX_BITS ? null : res.longValue();
        default:
          if (y == 0) {
            return 1L;
          }
          final Long t = get(w, x, y - 1);
          return t == null || t >= LIMIT ? null : get(w - 1, x, t.intValue());
      }
    }
  };

  @Override
  public Z next() {
    if (mN >= LIMIT) {
      throw new UnsupportedOperationException();
    }
    if (mN == 0) {
      mOps.put(1, 0);
    } else {
      // Expand forward
      final int cn = mOps.get(mN);
      for (int w = 1; w <= Math.min(MAX_HYPER, mN); ++w) {
        final int cw = mOps.get(w);
        for (int x = 1; x <= mN; ++x) {
          final int cx = mOps.get(x);
          final Long v = mH.get(w, x, mN);
          if (v != null && v < LIMIT) {
            final int vi = v.intValue();
            final int c = cw + cn + cx + 1;
            final Integer cnt = mOps.get(vi);
            if (cnt == null || cnt > c) {
              mOps.put(vi, c);
            }
          }
          if (w > 2 && mN != x) {
            // We need to try both x^n and n^x, x^^n and n^^x, etc.
            final Long u = mH.get(w, mN, x);
            if (u != null && u <= LIMIT) {
              final int ui = u.intValue();
              final int c = cw + cn + cx + 1;
              final Integer cnt = mOps.get(ui);
              if (cnt == null || cnt > c) {
                mOps.put(ui, c);
              }
            }
          }
        }
      }
    }
    return Z.valueOf(mOps.get(++mN));
  }
}
