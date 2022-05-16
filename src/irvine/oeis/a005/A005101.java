package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005101 Abundant numbers (sum of divisors of m exceeds 2m).
 * @author Sean A. Irvine
 */
public class A005101 implements Sequence {

  private Z mN = Z.valueOf(11);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(mN).sigma().compareTo(mN.multiply2()) > 0) {
        return mN;
      }
    }
  }
}
