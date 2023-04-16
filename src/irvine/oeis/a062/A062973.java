package irvine.oeis.a062;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a048.A048050;

/**
 * A062973 Chowla function of n is not divisible by phi(n).
 * @author Sean A. Irvine
 */
public class A062973 extends A048050 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(Euler.phiAsLong(mN)) != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

