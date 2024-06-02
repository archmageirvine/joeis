package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070173 Numbers k such that k! and 2^k+1 are relatively prime.
 * @author Sean A. Irvine
 */
public class A070173 extends Sequence1 {

  private long mN = 0;
  private Z mF = Z.ONE;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      mT = mT.multiply2();
      if (mF.gcd(mT.add(1)).equals(Z.ONE)) {
        return Z.valueOf(mN);
      }
    }
  }
}
