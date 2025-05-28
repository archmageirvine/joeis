package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A077510 Numbers k such that k + pi(k) is a prime.
 * @author Sean A. Irvine
 */
public class A077510 extends A000720 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().add(mN).isProbablePrime()) {
        return mN;
      }
    }
  }
}
