package irvine.oeis.a265;
// Generated by gen_seq4.pl caelem/ca1whites at 2021-12-16 21:00

import irvine.math.z.Z;
import irvine.oeis.ca.Cellular1DAutomaton;

/**
 * A265323 Total number of OFF (white) cells after n iterations of the "Rule 110" elementary cellular automaton starting with a single ON (black) cell.
 * @author Georg Fischer
 */
public class A265323 extends Cellular1DAutomaton {

  /** Construct the sequence. */
  public A265323() {
    super(110);
  }

  @Override
  public Z next() {
    return super.nextWhiteSum();
  }
}
