package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005231 Odd abundant numbers (odd numbers n whose sum of divisors exceeds 2n).
 * @author Sean A. Irvine
 */
public class A005231 implements Sequence {

  private Z mN = Z.valueOf(943);

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
