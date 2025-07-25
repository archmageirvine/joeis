package irvine.oeis.a138;
// Generated by gen_seq4.pl tuptraf/simtraf at 2023-10-28 00:07

import irvine.oeis.a066.A066495;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A138042 Numbers k such that A096379(k)=A096379(k+1).
 * @author Georg Fischer
 */
public class A138042 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A138042() {
    super(1, new A066495(), v -> v.subtract(2));
  }
}
