package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a025.A025475;

/**
 * A060848 Difference between a nontrivial prime power (A025475) and the next prime.
 * @author Sean A. Irvine
 */
public class A060848 extends A025475 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    final Z p = super.next();
    return mPrime.nextPrime(p).subtract(p);
  }
}
