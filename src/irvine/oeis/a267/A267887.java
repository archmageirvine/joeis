package irvine.oeis.a267;
// Generated by gen_seq4.pl caelem/ca1stageb at 2021-12-16 21:00

import irvine.math.z.Z;
import irvine.oeis.ca.Cellular1DAutomaton;

/**
 * A267887 Binary representation of the n-th iteration of the "Rule 237" elementary cellular automaton starting with a single ON (black) cell.
 * @author Georg Fischer
 */
public class A267887 extends Cellular1DAutomaton {

  /** Construct the sequence. */
  public A267887() {
    super(237);
  }

  @Override
  public Z next() {
    return super.nextStageB();
  }
}
