package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.oeis.a073.A073640;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A080152 Values of n corresponding to the primes given in A073640. The concatenation of the a(n) and a(n+1)-th primes for any n is also prime.
 * @author Sean A. Irvine
 */
public class A080152 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A080152() {
    super(0, new A073640(), Functions.PRIME_PI::z);
  }
}
