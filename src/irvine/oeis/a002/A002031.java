package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A002031 Number of labeled connected digraphs on n nodes where every node has indegree 0 or outdegree 0 and no isolated nodes.
 * @author Sean A. Irvine
 */
public class A002031 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return A002032.f(++mN, 2);
  }
}

