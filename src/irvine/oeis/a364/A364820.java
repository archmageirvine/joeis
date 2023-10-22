package irvine.oeis.a364;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;
import irvine.oeis.a000.A000129;

/**
 * A368220.
 * @author Sean A. Irvine
 */
public class A364820 extends A000129 {

  {
    super.next();
    super.next();
    setOffset(2);
  }

  @Override
  public Z next() {
    return LeastPrimeFactorizer.lpf(super.next());
  }
}
