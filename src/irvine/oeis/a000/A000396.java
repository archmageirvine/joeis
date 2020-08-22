package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000396 Perfect numbers n: n is equal to the sum of the proper divisors of n.
 * @author Sean A. Irvine
 */
public class A000396 extends A000043 {

  @Override
  public Z next() {
    final long pp = super.next().longValue();
    if (pp > Integer.MAX_VALUE) {
      throw new UnsupportedOperationException();
    }
    final int p = (int) pp;
    return Z.ONE.shiftLeft(p).subtract(1).shiftLeft(p - 1);
  }
}

