package irvine.oeis.a336;
// Generated by gen_seq4.pl dirtraf at 2024-02-03 12:35

import irvine.oeis.a000.A000188;
import irvine.oeis.a038.A038040;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A336318 Square root of the largest square dividing n*d(n), where d(n) is the number of divisors of n, A000005.
 * @author Georg Fischer
 */
public class A336318 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A336318() {
    super(1, new A000188(), new A038040());
  }
}
