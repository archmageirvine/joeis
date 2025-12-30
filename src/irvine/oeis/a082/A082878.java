package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.oeis.a084.A084227;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A082878 Arithmetic derivative of numbers of the form p*q^k with distinct primes p and q, k &gt; 0.
 * @author Sean A. Irvine
 */
public class A082878 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A082878() {
    super(1, new A084227(), Functions.ARD::z);
  }
}
