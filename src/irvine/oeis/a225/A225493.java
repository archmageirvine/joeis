package irvine.oeis.a225;
// Generated by gen_seq4.pl 2024-08-01.ack/mulclose at 2024-08-01 22:21

import irvine.oeis.a051.A051634;
import irvine.oeis.closure.MultiplicativeClosureSequence;

/**
 * A225493 Numbers having only strong prime factors, cf. A051634.
 * @author Georg Fischer
 */
public class A225493 extends MultiplicativeClosureSequence {

  /** Construct the sequence. */
  public A225493() {
    super(1, new A051634());
  }
}
