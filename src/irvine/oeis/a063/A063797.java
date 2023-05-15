package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063797 Numbers n such that sigma(d(n^3))==d(sigma(n^2)), where d(n) is the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A063797 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(Jaguar.factor(mN.pow(3)).sigma0()).sigma().equals(Jaguar.factor(Jaguar.factor(mN.square()).sigma()).sigma0())) {
        return mN;
      }
    }
  }
}
