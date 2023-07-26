package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.oeis.a031.A031974;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A064768 Sum of primes dividing the repunit numbers with a prime number of digits [A031974] (with repetition).
 * @author Sean A. Irvine
 */
public class A064768 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A064768() {
    super(new A031974(), k -> Jaguar.factor(k).sopf());
  }
}

