package irvine.oeis.a006;

import irvine.math.LongUtils;
import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006264 Diagonal length function.
 * @author Sean A. Irvine
 */
public class A006264 extends MemoryFunction2<Long, Integer> implements Sequence {

  private long mN = -1;

  private long alpha(final long m, final long n) {
    switch((int) m) {
      case 0:
        return n / 2;
      case 1:
        return LongUtils.lg(n);
      case 2:
        long c = 0;
        long t = n;
        while (t > 1) {
          ++c;
          t = LongUtils.lg(t);
        }
        return c;
      case -1:
      case 3:
        if (n < 2) {
          return 0;
        } else if (n < 4) {
          return 1;
        } else if (n < 65536) {
          return 2;
        } else {
          return 3; // good for rest of long args
        }
      case 4:
        if (n < 2) {
          return 0;
        } else {
          return 3; // good for rest of long args
        }
      default:
        throw new UnsupportedOperationException();
    }
  }

  private static final long[] BIG_A = {1, 2, 4, 1 << 16};

  @Override
  protected Integer compute(final Long m, final Long n) {
    if (m == -1) {
      if (n <= 1) {
        return 0;
      }
      final long an = alpha(-1, n);
      if (alpha(an, n) == alpha(an, BIG_A[(int) (an + 1)] - 1)) {
        return (int) (get(an, n) + alpha(an, n) - an);
      } else {
        return (int) (get(an, n) + alpha(an, n) - an + 1);
      }
    }
    if (m == 0) {
      return n <= 1 ? 0 : 1;
    }
    if (n <= 1) {
      return 0;
    }
    return get(m - 1, n) + get(m, alpha((int) (m - 1), n));
  }

  @Override
  public Z next() {
    return Z.valueOf(get(-1L, ++mN));
  }
}

