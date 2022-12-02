package irvine.oeis.a341;

import irvine.math.z.Z;
import irvine.oeis.a048.A048673;

/**
 * A341346 a(n) = A048673(2n-1) mod 3.
 * @author Georg Fischer
 */
public class A341346 extends A048673 {

  @Override
  public Z next() {
    final Z result = super.next().mod(Z.THREE);
    super.next();
    return result;
  }
}
