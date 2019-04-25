package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016728 Number of integer points <code>(x,y,z)</code> at distance <code>&lt;= 0.5</code> from sphere of radius n.
 * @author Sean A. Irvine
 */
public class A016728 implements Sequence {

  // There is probably a much better way to do this ...

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long x = 0; x <= mN; ++x) {
      for (long y = 0; y <= mN; ++y) {
        for (long z = 0; z <= mN; ++z) {
          final double d = Math.abs(Math.sqrt(x * x + y * y + z * z) - mN);
          if (d <= 0.5) {
            final int a = x == 0 ? 1 : 2;
            final int b = y == 0 ? a : 2 * a;
            final int c = z == 0 ? b : 2 * b;
            cnt += c;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}

