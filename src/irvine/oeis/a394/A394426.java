package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a049.A049419;
import irvine.oeis.a197.A197680;

/**
 * A394426 The number of exponential divisors of the numbers whose exponents in their prime factorization are squares (A197680).
 * @author Sean A. Irvine
 */
public class A394426 extends A197680 {

  private final DirectSequence mExponentialDivisors = new A049419();

  @Override
  public Z next() {
    return mExponentialDivisors.a(super.next());
  }
}

