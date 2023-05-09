package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a051.A051953;

/**
 * A063719 Numbers n such that usigma(cototient(n)) is a prime.
 * @author Sean A. Irvine
 */
public class A063719 extends A051953 {

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(super.next()).unitarySigma().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

