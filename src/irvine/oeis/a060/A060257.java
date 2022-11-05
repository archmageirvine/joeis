package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A060257 Numbers k such that 1/prime(k) has period prime(k) - 1.
 * @author Sean A. Irvine
 */
public class A060257 extends Sequence1 {

  protected final Fast mPrime = new Fast();
  protected Z mP = Z.FIVE;
  protected long mN = 3;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP = mPrime.nextPrime(mP);
      if (ZUtils.isPrimitiveRoot(Z.TEN, mP)) {
        return Z.valueOf(mN);
      }
    }
  }
}
