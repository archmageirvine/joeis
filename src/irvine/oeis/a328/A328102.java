package irvine.oeis.a328;

import irvine.math.z.Z;
import irvine.oeis.ca.Cellular1DAutomaton;

/**
 * A328102 Column immediately left of the middle column of rule-30 1-D cellular automaton, when started from a lone 1 cell.
 * @author Georg Fischer
 */
public class A328102 extends Cellular1DAutomaton {

  /** Construct the sequence. */
  public A328102() {
    super(1, 30, 1);
    next();
  }

  @Override
  public Z next() {
    return super.nextMiddle(1);
  }
}
