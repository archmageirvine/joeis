package irvine.oeis.a006;

import irvine.math.graph.GraphUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A006649 Number of graphs with n nodes, n edges and no isolated vertices.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A006649 extends AbstractSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A006649() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ONE : GraphUtils.numberUnlabelledGraphs(mN, mN).subtract(GraphUtils.numberUnlabelledGraphs(mN - 1, mN)); // from A006406
  }
}
