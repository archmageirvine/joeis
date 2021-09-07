package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051343 Number of ways of writing n as a sum of 3 nonnegative cubes (counted naively).
 * @author Sean A. Irvine
 */
public class A051343 implements Sequence {

  private long mN = -1;

  protected long start() {
    return 0;
  }

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long ac, a = start(); (ac = a * a * a) <= mN; ++a) {
      final long t = mN - ac;
      for (long bc, b = a; (bc = b * b * b) <= t; ++b) {
        final long u = t - bc;
        final Z uz = Z.valueOf(u);
        final Z u3 = uz.root(3);
        if (uz.auxiliary() == 1) {
          final long c = u3.longValueExact();
          if (c >= b) {
            if (a == b) {
              cnt += b == c ? 1 : 3;
            } else if (b == c) {
              cnt += 3;
            } else {
              cnt += 6;
            }
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
