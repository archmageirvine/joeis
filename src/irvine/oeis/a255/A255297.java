package irvine.oeis.a255;
// Generated by gen_seq4.pl rultraf at 2024-01-19 09:13

import irvine.oeis.a027.A027649;
import irvine.oeis.transform.RunLengthTransformSequence;

/**
 * A255297 Number of ON cells after n generations of the odd-rule cellular automaton defined by OddRule 035 when started with a single ON cell.
 * @author Georg Fischer
 */
public class A255297 extends RunLengthTransformSequence {

  /** Construct the sequence. */
  public A255297() {
    super(0, new A027649());
  }
}
