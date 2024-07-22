package irvine.oeis.a066;

import irvine.math.z.Z;

/**
 * A066518 Anti-divisor class sums of n.
 * @author Sean A. Irvine
 */
public class A066518 extends A066452 {

  private int mN = 0;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    long sum = 0;
    for (final long d : antidivisors(++mN)) {
      final long r = 2 * (mN % d);
      if (r == d - 1) {
        --sum;
      } else if (r == d + 1) {
        ++sum;
      }
    }
    return Z.valueOf(sum);
  }
}
