package irvine.oeis.a369;
// Generated by gen_seq4.pl dirtraf at 2024-02-03 12:35

import irvine.oeis.a000.A000203;
import irvine.oeis.a356.A356193;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A369720 The sum of divisors of the smallest cubefull number that is a multiple of n.
 * @author Georg Fischer
 */
public class A369720 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A369720() {
    super(1, new A000203(), new A356193());
  }
}
