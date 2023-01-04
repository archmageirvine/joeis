package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a025.A025475;

/**
 * A060845 Largest prime &lt; a nontrivial power of a prime.
 * @author Sean A. Irvine
 */
public class A060845 extends A025475 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return mPrime.prevPrime(super.next());
  }
}
