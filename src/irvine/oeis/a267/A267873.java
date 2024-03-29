package irvine.oeis.a267;
// Generated by gen_seq4.pl caelem/ca1blackn at 2021-12-16 21:00

import irvine.math.z.Z;
import irvine.oeis.ca.Cellular1DAutomaton;

/**
 * A267873 Number of ON (black) cells in the n-th iteration of the "Rule 235" elementary cellular automaton starting with a single ON (black) cell.
 * @author Georg Fischer
 */
public class A267873 extends Cellular1DAutomaton {

  /** Construct the sequence. */
  public A267873() {
    super(235);
  }

  @Override
  public Z next() {
    return super.nextBlackCount();
  }
}
