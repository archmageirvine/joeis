package irvine.oeis.a132;
// manually 2012-07-20

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A132999 Imperfect numbers: Not equal to sum of proper divisors.
 * @author Georg Fischer
 */
public class A132999 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Cheetah.factor(mN).sigma().compareTo(mN.multiply2()) != 0) {
        return mN;
      }
    }
  }
}