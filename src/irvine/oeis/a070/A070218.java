package irvine.oeis.a070;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070218 a(1) = 2; a(n) is the smallest prime greater than the sum of all previous terms.
 * @author Sean A. Irvine
 */
public class A070218 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return Z.TWO;
    } else {
      final Z res = mPrime.nextPrime(mA);
      mA = mA.add(res);
      return res;
    }
  }
}

