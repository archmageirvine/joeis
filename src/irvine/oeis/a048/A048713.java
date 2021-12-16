package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.ca.Cellular1DAutomaton;

/**
 * A048713 3rd row of Family 1 &quot;90 x 150 array&quot;: generations 0 .. n of Rule 90 starting from seed pattern 21.
 * @author Georg Fischer
 */
public class A048713 extends Cellular1DAutomaton {

  /** Construct the sequence. */
  public A048713() {
    super(90, 21);
  }

  @Override
  public Z next() {
    return super.nextStageD();
  }
}
