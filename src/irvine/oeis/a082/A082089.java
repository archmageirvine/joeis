package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A082089 a(n)-th prime is the fixed point if function A008472 is iterated when started at factorial of n-th prime.
 * @author Sean A. Irvine
 */
public class A082089 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A082089() {
    super(2, new A082088(), Functions.PRIME_PI::z);
  }
}
