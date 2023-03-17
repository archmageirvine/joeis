package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037138 Numbers k such that sigma(totient(k)) + sigma(cototient(k)) = 2k.
 * @author Sean A. Irvine
 */
public class A037138 extends Sequence1 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z phi = Euler.phi(mN);
      if (Jaguar.factor(phi).sigma().add(Jaguar.factor(mN.subtract(phi)).sigma()).equals(mN.multiply2())) {
        return mN;
      }
    }
  }
}
