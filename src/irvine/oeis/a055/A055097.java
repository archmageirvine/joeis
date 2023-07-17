package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A055097 Number of divisors for each term in the triangle A055096. It is 2 for primes (all of the form 4k+1).
 * @author Georg Fischer
 */
public class A055097 extends A055096 {

  /** Construct the sequence. */
  public A055097() {
    super(1);
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0();
  }
}
