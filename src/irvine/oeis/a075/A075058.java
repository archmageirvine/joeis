package irvine.oeis.a075;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075058 Lexicographically earliest infinite sequence of distinct positive numbers with the property that every positive integer is a sum of distinct terms (see algorithm below).
 * @author Sean A. Irvine
 */
public class A075058 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    final Z t = mPrime.prevPrime(mA.add(2));
    mA = mA.add(t);
    return t;
  }
}
