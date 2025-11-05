package irvine.oeis.a081;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081601 Numbers m such that 3 does not divide Sum_{k=0..m} binomial(2k,k) = A006134(m).
 * @author Sean A. Irvine
 */
public class A081601 extends Sequence1 {

  private long mN = -1;
  private long mSum = 0;

  @Override
  public Z next() {
    while (true) {
      mSum += Binomial.binomial(2 * ++mN, mN, 3);
      mSum %= 3;
      if (mSum != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
