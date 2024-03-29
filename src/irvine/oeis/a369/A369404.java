package irvine.oeis.a369;
// Generated by gen_seq4.pl 2024-02-28/tuptraf at 2024-02-28 22:56

import irvine.oeis.a000.A000079;
import irvine.oeis.a033.A033999;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A369404 a(n) = 3*2^n + 5*(-1)^n.
 * @author Georg Fischer
 */
public class A369404 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A369404() {
    super(0, (n, s) -> s[0].multiply(3).add(s[1].multiply(5)), "", new A000079(), new A033999());
  }
}
