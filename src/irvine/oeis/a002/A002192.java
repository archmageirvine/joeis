package irvine.oeis.a002;

import irvine.math.z.InverseSigma;
import irvine.math.z.Z;

/**
 * A002191 Possible values for sum of divisors of n.
 * @author Sean A. Irvine
 */
public class A002192 extends A002191 {

  @Override
  public Z next() {
    return InverseSigma.minInverseSigma(super.next(), 1);
  }
}
