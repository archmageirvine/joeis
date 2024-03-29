package irvine.oeis.a369;
// Generated by gen_seq4.pl dirtraf at 2024-02-05 19:10

import irvine.oeis.a000.A000203;
import irvine.oeis.a356.A356192;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A369758 The sum of divisors of the smallest cubefull exponentially odd number that is divisible by n.
 * @author Georg Fischer
 */
public class A369758 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A369758() {
    super(1, new A000203(), new A356192());
  }
}
