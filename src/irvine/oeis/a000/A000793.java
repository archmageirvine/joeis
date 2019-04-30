package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.partitions.IntegerPartition;

/**
 * A000793 Landau's function <code>g(n)</code>: largest order of permutation of n elements. Equivalently, largest LCM of partitions of n.
 * @author Sean A. Irvine
 */
public class A000793 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final IntegerPartition p = new IntegerPartition(mN);
    int[] v;
    Z best = Z.ZERO;
    while ((v = p.next()) != null) {
      Z lcm = Z.ONE;
      for (final int w : v) {
        lcm = lcm.lcm(Z.valueOf(w));
      }
      if (lcm.compareTo(best) > 0) {
        best = lcm;
      }
    }
    return best;
  }
}
