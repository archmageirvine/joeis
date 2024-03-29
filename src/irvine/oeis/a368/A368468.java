package irvine.oeis.a368;
// Generated by gen_seq4.pl dirtraf at 2024-01-19 19:49

import irvine.oeis.a268.A268335;
import irvine.oeis.a322.A322483;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A368468 a(n) is the number of exponentially odd divisors of the n-th exponentially odd number.
 * @author Georg Fischer
 */
public class A368468 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A368468() {
    super(1, new A322483(), new A268335());
  }
}
