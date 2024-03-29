package irvine.oeis.a267;
// Generated by gen_seq4.pl caelem/ca1whites at 2021-12-16 21:00

import irvine.math.z.Z;
import irvine.oeis.ca.Cellular1DAutomaton;

/**
 * A267593 Total number of OFF (white) cells after n iterations of the "Rule 169" elementary cellular automaton starting with a single ON (black) cell.
 * @author Georg Fischer
 */
public class A267593 extends Cellular1DAutomaton {

  /** Construct the sequence. */
  public A267593() {
    super(169);
  }

  @Override
  public Z next() {
    return super.nextWhiteSum();
  }
}
