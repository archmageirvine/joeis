package irvine.oeis.a060;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A060473 a(n) = numerator of phi(n)/(n+1), where phi(n) is Euler's phi, A000010.
 * @author Sean A. Irvine
 */
public class A060473 extends A000010 {

  @Override
  public Z next() {
    return new Q(super.next(), mN + 1).num();
  }
}
