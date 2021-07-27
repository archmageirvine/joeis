package irvine.oeis.a162;
// manually 2021-06-23

import irvine.math.z.Z;
import irvine.oeis.a023.A023302;

/**
 * A162019 Double-safe primes which are also double-Sophie Germain primes.
 * a(n)=4*A023302(n)+3
 * @author Georg Fischer
 */
public class A162019 extends A023302 {
    
  @Override
  public Z next() {
    return super.next().shiftLeft(2).add(Z.THREE);
  }
}
