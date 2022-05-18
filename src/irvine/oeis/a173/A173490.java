package irvine.oeis.a173;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A173490 Even abundant numbers (even numbers n whose sum of divisors exceeds 2n).
 * @author Sean A. Irvine
 */
public class A173490 implements Sequence {

  private Z mN = Z.TEN;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (Jaguar.factor(mN).sigma().compareTo(mN.multiply2()) > 0) {
        return mN;
      }
    }
  }
}
