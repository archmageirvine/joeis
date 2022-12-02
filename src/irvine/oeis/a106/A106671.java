package irvine.oeis.a106;
// manually modi

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A106671 a(n) = ( prime(n + 2) * prime(n) - prime(n + 1)^2 ) modulo 3.
 * @author Georg Fischer
 */
public class A106671 extends A000040 {

  private Z mP0 = super.next();
  private Z mP1 = super.next();
  private Z mP2 = super.next();

  @Override
  public Z next() {
    final Z result = mP2.multiply(mP0).subtract(mP1.square()).mod(Z.THREE);
    mP0 = mP1;
    mP1 = mP2;
    mP2 = super.next();
    return result;
  }
}
