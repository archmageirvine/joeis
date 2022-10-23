package irvine.oeis.a132;
// manually 2012-07-20

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A132999 Imperfect numbers: Not equal to sum of proper divisors.
 * @author Georg Fischer
 */
public class A132999 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(mN).sigma().compareTo(mN.multiply2()) != 0) {
        return mN;
      }
    }
  }
}
