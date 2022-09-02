package irvine.oeis.a328;

import irvine.math.z.Z;
import irvine.oeis.ca.Cellular1DAutomaton;

/**
 * A328101 Column immediately right of the middle column of rule-30 1-D cellular automaton, when started from a lone 1 cell.
 * @author Georg Fischer
 */
public class A328101 extends Cellular1DAutomaton {

  /** Construct the sequence. */
  public A328101() {
    super(1, 30, 1);
    next();
  }

  @Override
  public Z next() {
    return super.nextMiddle(-1);
  }
}
