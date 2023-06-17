package irvine.oeis.a160;

import irvine.math.group.SymmetricGroup;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A160449 Array read by antidiagonals: T(n,k) is the number of isomorphism classes of n-fold coverings of a connected graph with Betti number k (1 &lt;= n, 0 &lt;= k).
 * @author Sean A. Irvine
 */
public class A160449 extends AbstractSequence {

  /** Construct the sequence. */
  public A160449() {
    super(0);
  }

  private int mN = 0;
  private int mM = 0;

  protected Z t(final int n, final int k) {
    if (n == 1 || k == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final IntegerPartition part = new IntegerPartition(n);
    int[] p;
    final int[] c = new int[n + 1];
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, c);
      sum = sum.add(SymmetricGroup.per(c).pow(k - 1));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}
