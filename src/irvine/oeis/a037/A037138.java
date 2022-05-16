package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037138 Numbers k such that sigma(totient(k)) + sigma(cototient(k)) = 2k.
 * @author Sean A. Irvine
 */
public class A037138 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z phi = Jaguar.factor(mN).phi();
      if (Jaguar.factor(phi).sigma().add(Jaguar.factor(mN.subtract(phi)).sigma()).equals(mN.multiply2())) {
        return mN;
      }
    }
  }
}
