package irvine.oeis.a071;
// Generated by gen_seq4.pl ca.1m/ca1righthalf at 2021-12-28 07:10

import irvine.math.z.Z;
import irvine.oeis.ca.Cellular1DAutomaton;

/**
 * A071024 Triangle read by rows giving successive states of cellular automaton generated by "Rule 92".
 * @author Georg Fischer
 */
public class A071024 extends Cellular1DAutomaton {

  /** Construct the sequence. */
  public A071024() {
    super(92);
  }

  @Override
  public Z next() {
    return super.nextRightHalf();
  }
}
