package irvine.oeis.a002;

import irvine.math.graph.GraphUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002028 Number of connected graphs on n labeled nodes, each node being colored with one of 3 colors, such that no edge joins nodes of the same color.
 * @author Sean A. Irvine
 */
public class A002028 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return GraphUtils.numberConnectedLabelledColoured(++mN, 3);
  }

}
