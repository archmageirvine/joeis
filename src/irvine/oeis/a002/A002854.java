package irvine.oeis.a002;

import java.io.Serializable;

import irvine.math.IntegerUtils;
import irvine.math.group.SymmetricGroup;
import irvine.math.partition.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002854 Number of unlabeled Euler graphs with n nodes; number of unlabeled two-graphs with n nodes; number of unlabeled switching classes of graphs with n nodes; number of switching classes of unlabeled signed complete graphs on n nodes; number of Seidel matrices of order n.
 * @author Sean A. Irvine
 */
public class A002854 extends AbstractSequence implements Serializable {

  // After M. F. Hasler

  protected int mN;

  protected A002854(final int start) {
    super(1);
    mN = start - 1;
  }

  /** Construct the sequence. */
  public A002854() {
    this(1);
  }

  protected Q m(final int[] j) {
    int s = 0;
    for (int t = 1; t < j.length; ++t) {
      for (int r = 1; r < t; ++r) {
        s += IntegerUtils.gcd(r, t) * j[r] * j[t];
      }
    }
    for (int k = 1; k < j.length; ++k) {
      s += j[k] * ((k / 2) - 1) + k * j[k] * (j[k] - 1) / 2;
    }
    int u = 0;
    for (int k = 1; k < j.length; k += 2) {
      u += j[k];
    }
    return new Q(Z.ONE.shiftLeft(s + (u > 0 ? 1 : 0)));
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final IntegerPartition part = new IntegerPartition(mN);
    final int[] j = new int[mN + 1];
    int[] p;
    Q sum = Q.ZERO;
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, j);
      sum = sum.add(m(j).divide(SymmetricGroup.per(j)));
    }
    return sum.toZ();
  }
}
