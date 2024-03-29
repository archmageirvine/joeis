package irvine.oeis.a195;
// Generated by gen_seq4.pl 2023-12-27/dirtraf at 2023-12-27 22:04

import irvine.oeis.a000.A000166;
import irvine.oeis.a146.A146076;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A195209 Sum of even divisors of !n.
 * @author Georg Fischer
 */
public class A195209 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A195209() {
    super(0, new A146076(), new A000166());
  }
}
