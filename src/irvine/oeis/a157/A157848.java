package irvine.oeis.a157;
// Generated by gen_seq4.pl 2025-02-03.ack/sintrif at 2025-02-03 18:14

import irvine.math.function.Functions;
import irvine.oeis.a007.A007340;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A157848 Corresponding values of arithmetic means of divisors of numbers from A007340.
 * @author Georg Fischer
 */
public class A157848 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A157848() {
    super(1, (term, n) -> Functions.SIGMA1.z(term).divide(Functions.SIGMA0.z(term)), "", new A007340());
  }
}
