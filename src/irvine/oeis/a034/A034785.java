package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A034785 a(n) = 2^(n-th prime).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A034785 extends A000040 {

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(super.next().intValueExact());
  }
}
