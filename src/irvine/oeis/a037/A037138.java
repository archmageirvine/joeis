package irvine.oeis.a037;

import irvine.factor.factor.Cheetah;
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
      final Z phi = Cheetah.factor(mN).phi();
      if (Cheetah.factor(phi).sigma().add(Cheetah.factor(mN.subtract(phi)).sigma()).equals(mN.multiply2())) {
        return mN;
      }
    }
  }
}
