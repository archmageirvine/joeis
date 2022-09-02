package irvine.oeis.a328;

import irvine.math.z.Z;
import irvine.oeis.ca.Cellular1DAutomaton;

/**
 * A328100 Column which is two positions right of the middle column of rule-30 1-D cellular automaton, when started from a lone 1 cell.
 * @author Georg Fischer
 */
public class A328100 extends Cellular1DAutomaton {

  /** Construct the sequence. */
  public A328100() {
    super(2, 30, 1);
    next();
    next();
  }

  @Override
  public Z next() {
    return super.nextMiddle(-2);
  }
}
