package irvine.oeis.a173;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A173490 Even abundant numbers (even numbers n whose sum of divisors exceeds 2n).
 * @author Sean A. Irvine
 */
public class A173490 implements Sequence {

  private Z mN = Z.valueOf(10);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (Cheetah.factor(mN).sigma().compareTo(mN.multiply2()) > 0) {
        return mN;
      }
    }
  }
}
