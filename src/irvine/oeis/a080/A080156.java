package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A080156 Values of n corresponding to the terms in sequence A080155. For any k, the concatenation of the a(1) to a(k)-th primes is prime and each value of k is the smallest for which this is true.
 * @author Sean A. Irvine
 */
public class A080156 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A080156() {
    super(0, new A080155(), Functions.PRIME_PI::z);
  }
}
