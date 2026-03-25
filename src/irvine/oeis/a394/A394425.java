package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a046.A046100;
import irvine.oeis.a049.A049419;

/**
 * A394425 allocated for Amiram Eldar.
 * @author Sean A. Irvine
 */
public class A394425 extends A046100 {

  private final DirectSequence mExponentialDivisors = new A049419();

  @Override
  public Z next() {
    return mExponentialDivisors.a(super.next());
  }
}

