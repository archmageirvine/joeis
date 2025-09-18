package irvine.oeis.a387;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003022.
 * @author Sean A. Irvine
 */
public class A387687 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private final HashSet<Long> mUsed = new HashSet<>();
  private Z mProd = Z.ONE;
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (!mUsed.contains(mP) && mProd.add(mP).isProbablePrime()) {
        mProd = mProd.multiply(mP);
        mUsed.add(mP);
        return Z.valueOf(mP);
      }
    }
  }
}
