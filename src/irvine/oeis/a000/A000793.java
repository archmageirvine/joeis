package irvine.oeis.a000;

import irvine.math.IntegerUtils;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000793 Landau's function g(n): largest order of permutation of n elements. Equivalently, largest LCM of partitions of n.
 * @author Sean A. Irvine
 */
public class A000793 extends AbstractSequence {

  /* Construct the sequence. */
  public A000793() {
    super(0);
  }

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
      final Z lcm = IntegerUtils.lcm(v);
      if (lcm.compareTo(best) > 0) {
        best = lcm;
      }
    }
    return best;
  }
}
