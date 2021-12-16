package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.ca.Cellular1DAutomaton;

/**
 * A048712 2nd column of Family 1 &quot;90 X 150 array&quot;: generations 0 .. n of Rule 150 starting from seed pattern 5.
 * @author Georg Fischer
 */
public class A048712 extends Cellular1DAutomaton {

  /** Construct the sequence. */
  public A048712() {
    super(150, 5);
  }

  @Override
  public Z next() {
    return super.nextStageD();
  }
}
