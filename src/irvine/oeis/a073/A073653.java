package irvine.oeis.a073;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073653 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.THREE;
        mUsed.add(Z.THREE);
        return Z.THREE;
      }
      mB = Z.FIVE;
      mUsed.add(Z.FIVE);
      return Z.FIVE;
    }
    Z t = Z.ONE;
    while (true) {
      t = mPrime.nextPrime(t);
      if (t.add(mA).add(mB).isProbablePrime() && mUsed.add(t)) {
        mA = mB;
        mB = t;
        return t;
      }
    }
  }
}
