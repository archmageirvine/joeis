package irvine.oeis.a000;

import irvine.math.IntegerUtils;
import irvine.math.group.SymmetricGroup;
import irvine.math.partitions.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000595 Number of binary relations on n unlabeled points.
 * @author Sean A. Irvine
 */
public class A000595 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000595(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000595() {
    super(0);
  }

  protected int mN = -1;

  protected int t(final int[] j) {
    int sum = 0;
    for (int r = 0; r < j.length; ++r) {
      for (int s = 0; s < j.length; ++s) {
        sum += j[r] * j[s] * IntegerUtils.gcd(r, s);
      }
    }
    return sum;
  }

  protected Z zeroCase() {
    return Z.ONE;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return zeroCase();
    }
    final IntegerPartition ip = new IntegerPartition(mN);
    final int[] a = new int[mN + 1];
    Q s = Q.ZERO;
    int[] p;
    while ((p = ip.next()) != null) {
      IntegerPartition.toCountForm(p, a);
      s = s.add(new Q(Z.ONE.shiftLeft(t(a)), SymmetricGroup.per(a)));
    }
    return s.toZ();
  }
}
