package irvine.oeis.a040;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000149;

/**
 * A040016 Largest prime &lt; e^n.
 * @author Sean A. Irvine
 */
public class A040016 extends A000149 {

  {
    super.next();
  }
  private final Fast mPrime = new Fast();
  private Z mP = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = super.next();
    Z a = mP;
    while (mP.compareTo(t) <= 0) {
      a = mP;
      mP = mPrime.nextPrime(mP);
    }
    return a;
  }
}
