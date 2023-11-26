package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005231 Odd abundant numbers (odd numbers m whose sum of divisors exceeds 2m).
 * @author Sean A. Irvine
 */
public class A005231 extends Sequence1 {

  private Z mN = Z.valueOf(943);

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
