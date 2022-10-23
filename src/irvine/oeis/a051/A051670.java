package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051670 Smallest prime that concatenated with all previous terms of sequence forms a prime.
 * @author Sean A. Irvine
 */
public class A051670 extends Sequence1 {

  private final StringBuilder mA = new StringBuilder();
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    long p = 1;
    final int pos = mA.length();
    while (true) {
      p = mPrime.nextPrime(p);
      if (new Z(mA.append(p)).isProbablePrime()) {
        return Z.valueOf(p);
      }
      mA.delete(pos, mA.length());
    }
  }
}

