package irvine.oeis.a267;
// Generated by gen_seq4.pl caelem/ca1stageb at 2021-12-16 21:00

import irvine.math.z.Z;
import irvine.oeis.ca.Cellular1DAutomaton;

/**
 * A267674 Binary representation of the n-th iteration of the "Rule 195" elementary cellular automaton starting with a single ON (black) cell.
 * @author Georg Fischer
 */
public class A267674 extends Cellular1DAutomaton {

  /** Construct the sequence. */
  public A267674() {
    super(195);
  }

  @Override
  public Z next() {
    return super.nextStageB();
  }
}
