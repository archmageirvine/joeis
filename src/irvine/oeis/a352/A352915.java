package irvine.oeis.a352;
// Generated by gen_seq4.pl 2024-01-16/moetraf at 2024-01-19 19:57

import irvine.oeis.a000.A000040;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A352915 Moebius transform of odd primes.
 * @author Georg Fischer
 */
public class A352915 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A352915() {
    super(1, new A000040().skip(1), 0);
    next();
  }
}
