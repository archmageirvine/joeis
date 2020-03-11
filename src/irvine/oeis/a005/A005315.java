package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005315.
 * @author Andrew Howroyd
 * @author Sean A. Irvine (Java port)
 */
public class A005315 extends A005316 {

  private int mN = -4;

  @Override
  public Z next() {
    mN += 2;
    final SimpleProcessor<Z> processor = new SimpleProcessor<>();
    processor.setCreateStateMachine(BasicMeanderProblem::new);
    return processor.process(mN, new BasicMeanderProblem(mN).openMeanderInitialStates());
  }
}
