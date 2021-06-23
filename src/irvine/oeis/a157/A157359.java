package irvine.oeis.a157;
// manually 2021-06-23

import irvine.math.z.Z;
import irvine.oeis.a023.A023302;

/**
 * A157359 Quatro-safe primes.
 * a(n)=16*A023302(n)+15
 * @author Georg Fischer
 */

public class A157359 extends A023302 {
    
  @Override
  public Z next() {
    return super.next().shiftLeft(4).add(Z.valueOf(15));
  }
}
