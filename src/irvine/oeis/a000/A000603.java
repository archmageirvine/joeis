package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000603 Number of nonnegative solutions to x^2 + y^2 &lt;= n^2.
 * @author Sean A. Irvine
 */
public class A000603 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long c;
    ++mN;
    c = 0;
    final long s = mN * mN;
    for (long x = 0; x <= mN; ++x) {
      for (long y = x; y <= mN; ++y) {
        if (x * x + y * y - s <= 0) {
          if (y == x) {
            ++c;
          } else {
            c += 2;
          }
        }
      }
    }
    return Z.valueOf(c);
  }
}

