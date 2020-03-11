package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a005.A005316;

/**
 * A000682 <code>Semi-meanders</code>: number of ways a semi-infinite directed curve can cross a straight line n times.
 * @author Sean A. Irvine
 */
public class A000682 extends A005316 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final SimpleProcessor<Z> processor = new SimpleProcessor<>();
    processor.setCreateStateMachine(BasicMeanderProblem::new);
    return processor.process(mN, new BasicMeanderProblem(mN).semiMeanderInitialStates());
  }
}

