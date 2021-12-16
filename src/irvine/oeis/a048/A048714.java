package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.ca.Cellular1DAutomaton;

/**
 * A048714 3rd column of Family 1 &quot;90 x 150 array&quot;: generations 0 .. n of Rule 150 starting from seed pattern 17.
 * @author Georg Fischer
 */
public class A048714 extends Cellular1DAutomaton {

  /** Construct the sequence. */
  public A048714() {
    super(150, 17);
  }

  @Override
  public Z next() {
    return super.nextStageD();
  }
}
