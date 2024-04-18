package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002321;

/**
 * A062982 Numbers n such that Mertens's function of n (A002321) is divisible by phi(n).
 * @author Sean A. Irvine
 */
public class A062982 extends A002321 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(Functions.PHI.l(mN)) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

