package irvine.oeis.a069;

import java.util.ArrayList;

import irvine.math.graph.GraphUtils;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069831.
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
      final ArrayList<Integer> v = new ArrayList<>();
      for (final int t : p) {
        v.add(2 * t);
      }
      if (GraphUtils.isGraph(v)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }

}

