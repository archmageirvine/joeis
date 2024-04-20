package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A065314 Smallest prime divisor of (n-th primorial - (n+1)-st prime).
 * @author Sean A. Irvine
 */
public class A065314 extends A002110 {

  {
    super.next();
    super.next();
    super.next();
    setOffset(3);
  }

  @Override
  public Z next() {
    return Functions.LPF.z(super.next().subtract(mPrime.nextPrime(mP)));
  }
}
