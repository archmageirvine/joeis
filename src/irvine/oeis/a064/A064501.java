package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064501 Sum of unitary divisors of n^3 is a square.
 * @author Sean A. Irvine
 */
public class A064501 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(mN).pow(3).unitarySigma().isSquare()) {
        return mN;
      }
    }
  }
}
