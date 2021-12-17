package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.ca.Cellular1DAutomaton;

/**
 * A048711 2nd row of Family 1 "90 X 150 array": generations 0 .. n of Rule 90 starting from seed pattern 7.
 * @author Georg Fischer
 */
public class A048711 extends Cellular1DAutomaton {

  /** Construct the sequence. */
  public A048711() {
    super(90, 7);
  }

  @Override
  public Z next() {
    return super.nextStageD();
  }
}
