package irvine.oeis.a367;
// Generated by gen_seq4.pl 2024-04-11/tuptraf at 2024-04-11 21:12

import irvine.oeis.a000.A000178;
import irvine.oeis.a268.A268506;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A367569 a(n) = Product_{k=0..n} (5*k)! / k!^5.
 * @author Georg Fischer
 */
public class A367569 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A367569() {
    super(0, (n, s) -> s[0].divide(s[1].pow(5)), "", new A268506(), new A000178());
  }
}
