package irvine.oeis.a095;
// Generated by gen_seq4.pl 2023-10-19/simtraf at 2023-10-19 23:32

import irvine.oeis.a099.A099774;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A095374 One less than the number of divisors of 2*n + 1.
 * @author Georg Fischer
 */
public class A095374 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A095374() {
    super(1, new A099774().skip(1), v -> v.subtract(1));
  }
}
