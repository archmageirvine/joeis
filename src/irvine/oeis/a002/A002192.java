package irvine.oeis.a002;

import irvine.math.z.InverseSigma;
import irvine.math.z.Z;

/**
 * A002192 Least integer with A000203(a(n)) = A002191(n), where A002191 = range of the sum-of-divisors function A000203.
 * @author Sean A. Irvine
 */
public class A002192 extends A002191 {

  @Override
  public Z next() {
    return InverseSigma.minInverseSigma(super.next(), 1);
  }
}
