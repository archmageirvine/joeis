package irvine.oeis.a064;
// manually

import irvine.math.z.Z;
import irvine.oeis.a007.A007947;

/**
 * A064549 a(n) = n * Product_{primes p|n} p.
 * @author Georg Fischer
 */
public class A064549 extends A007947 {

  protected int mN = 0;
  
  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(super.next());
  }
}
