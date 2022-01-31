package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A054270 Largest prime below prime(n)^2 (A001248).
 * @author Sean A. Irvine
 */
public class A054270 extends A000040 {

  @Override
  public Z next() {
    return mPrime.prevPrime(super.next().square());
  }
}
