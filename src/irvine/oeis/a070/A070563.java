package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.a000.A000594;

/**
 * A070563 a(n) = 0 if 3 divides the Ramanujan number tau(n) (A000594(n)), otherwise 1.
 * @author Georg Fischer
 */
public class A070563 extends A000594 {

  @Override
  public Z next() {
    return super.next().mod(Z.THREE).isZero() ? Z.ZERO : Z.ONE;
  }
}
