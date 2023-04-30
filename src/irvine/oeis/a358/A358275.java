package irvine.oeis.a358;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;
import irvine.oeis.a098.A098129;

/**
 * A358275 Least prime factor of A098129(n).
 * @author Sean A. Irvine
 */
public class A358275 extends A098129 {

  {
    super.next();
    setOffset(2);
  }

  @Override
  public Z next() {
    return LeastPrimeFactorizer.lpf(super.next());
  }
}

