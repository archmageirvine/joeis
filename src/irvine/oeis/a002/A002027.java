package irvine.oeis.a002;

import irvine.math.graph.GraphUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002027.
 * @author Sean A. Irvine
 */
public class A002027 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return GraphUtils.numberConnectedLabelledColoured(++mN, 2);
  }

}
