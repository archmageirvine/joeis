package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a025.A025475;

/**
 * A060847 Difference between a nontrivial prime power (A025475) and the previous prime.
 * @author Sean A. Irvine
 */
public class A060847 extends A025475 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    final Z p = super.next();
    return p.subtract(mPrime.prevPrime(p));
  }
}
