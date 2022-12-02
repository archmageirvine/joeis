package irvine.oeis.a354;

import irvine.math.z.Z;
import irvine.oeis.a182.A182665;

/**
 * A354920 a(n) = A182665(n) mod 2, where A182665(n) is the greatest x &lt; n such that n divides x*(x-1).
 * @author Georg Fischer
 */
public class A354920 extends A182665 {

  @Override
  public Z next() {
    return super.next().and(Z.ONE);
  }
}
