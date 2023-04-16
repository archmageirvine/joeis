package irvine.oeis.a062;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a048.A048050;

/**
 * A062972 Numbers k such that the Chowla function of k is divisible by phi(k).
 * @author Sean A. Irvine
 */
public class A062972 extends A048050 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(Euler.phiAsLong(mN)) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

