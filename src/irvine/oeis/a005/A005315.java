package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;

/**
 * A005315 Closed meandric numbers (or meanders): number of ways a loop can cross a road 2n times.
 * @author Andrew Howroyd
 * @author Sean A. Irvine (Java port)
 */
public class A005315 extends A005316 implements DirectSequence {

  private int mN = -4;

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    final SimpleProcessor<Z> processor = new SimpleProcessor<>();
    processor.setCreateStateMachine(BasicMeanderProblem::new);
    return processor.process(n, new BasicMeanderProblem(n).initialStates());
  }

  @Override
  public Z next() {
    mN += 2;
    return a(mN);
  }

}
