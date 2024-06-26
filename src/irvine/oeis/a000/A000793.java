package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000793 Landau's function g(n): largest order of permutation of n elements. Equivalently, largest LCM of partitions of n.
 * @author Sean A. Irvine
 */
public class A000793 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000793(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
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
      final Z lcm = Functions.LCM.z(v);
      if (lcm.compareTo(best) > 0) {
        best = lcm;
      }
    }
    return best;
  }
}
