package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a025.A025475;

/**
 * A060846 Smallest prime &gt; a nontrivial power of a prime.
 * @author Sean A. Irvine
 */
public class A060846 extends A025475 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return mPrime.nextPrime(super.next());
  }
}
