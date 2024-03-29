package irvine.oeis.a369;
// Generated by gen_seq4.pl dirtraf at 2024-02-03 12:35

import irvine.oeis.a000.A000203;
import irvine.oeis.a197.A197863;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A369717 The sum of divisors of the smallest powerful number that is a multiple of n.
 * @author Georg Fischer
 */
public class A369717 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A369717() {
    super(1, new A000203(), new A197863());
  }
}
