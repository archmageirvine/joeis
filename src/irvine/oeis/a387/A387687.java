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

  @Override
  public Z next() {
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (!mUsed.contains(p) && mProd.add(p).isProbablePrime()) {
        mProd = mProd.multiply(p);
        mUsed.add(p);
        return Z.valueOf(p);
      }
    }
  }
}
