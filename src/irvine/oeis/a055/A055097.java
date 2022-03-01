package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A055097 Number of divisors for each term in the triangle A055096. It is 2 for primes (all of the form 4k+1).
 * @author Georg Fischer
 */
public class A055097 extends A055096 {

  @Override
  public Z next() {
    return Cheetah.factor(super.next()).sigma0();
  }
}
