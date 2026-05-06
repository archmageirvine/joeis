package irvine.oeis.a106;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A106291 Period of the Lucas sequence A000032 mod n.
 * @author Sean A. Irvine
 */
public class A106291 extends Sequence1 {

  private int mN = 0;

  /**
   * Find the Pisano period of a Lucas number.
   * @param n number
   * @return period
   */
  public static long pisanoPeriod(final long n) {
    if (n < 3) {
      return (n << 1) - 1;
    }
    long aa = 2;
    long ab = 1;
    long k = 0;
    while (true) {
      ++k;
      final long s = (aa + ab) % n;
      aa = ab;
      ab = s;
      if (aa == 2 && ab == 1) {
        return k;
      }
    }
  }

  @Override
  public Z next() {
    return Z.valueOf(pisanoPeriod(++mN));
  }
}
