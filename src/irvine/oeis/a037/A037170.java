package irvine.oeis.a037;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A037170 Numbers n such that n = pi(n) + phi(n), where pi = A000720, phi = A000010.
 * @author Sean A. Irvine
 */
public class A037170 extends A000720 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().add(Functions.PHI.z(mN)).equals(mN)) {
        return mN;
      }
    }
  }
}
