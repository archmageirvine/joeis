package irvine.oeis.a032;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032664 Digit '1' concatenated with a(n) is a prime.
 * @author Sean A. Irvine
 */
public class A032664 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mMult = Z.TEN;
  private Z mP = Z.TEN.multiply(digit() - '0');

  protected char digit() {
    return '1';
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final String sp = mP.toString();
      if (sp.charAt(0) != digit()) {
        final Z t = mMult;
        mMult = mMult.multiply(10);
        mP = mMult.multiply(digit() - '0').add(t).subtract(1); // i.e., mP = d0999...
        continue;
      }
      return new Z(sp.substring(1));
    }
  }
}
