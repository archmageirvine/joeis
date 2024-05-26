package irvine.oeis.a069;

import irvine.math.graph.GraphUtils;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069831 Number of graphical partitions of simple Eulerian graphs (partitions given by the degrees of vertices of simple (no loops or multiple edges) graphs having only vertices of even degrees) having n edges.
 * @author Sean A. Irvine
 */
public class A069831 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return mN == 0 ? Z.ONE : Z.ZERO;
    }
    long cnt = 0;
    final IntegerPartition part = new IntegerPartition(mN);
    int[] p;
    while ((p = part.next()) != null) {
      // Compute 2 * p, so that every "vertex" is even
      for (int k = 0; k < p.length; ++k) {
        p[k] *= 2;
      }
      if (GraphUtils.isGraph(p)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }

}

