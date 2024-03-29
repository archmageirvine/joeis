package irvine.oeis.a258;
// Generated by gen_seq4.pl tuptraf/simtraf at 2023-10-28 00:07

import irvine.oeis.a208.A208570;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A258115 a(n) = A208570(n)/n.
 * @author Georg Fischer
 */
public class A258115 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A258115() {
    super(1, new A208570(), (n, v) -> v.divide(n));
  }
}
