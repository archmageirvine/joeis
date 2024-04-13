package irvine.oeis.a004;

import irvine.math.IntegerUtils;
import irvine.math.group.SymmetricGroup;
import irvine.math.partition.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004105 Number of point-self-dual nets with 2n nodes. Also number of directed 2-multigraphs with loops on n nodes.
 * @author Sean A. Irvine
 */
public class A004105 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A004105(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A004105() {
    super(0);
  }

  private int mN = -1;

  protected Z base() {
    return Z.THREE;
  }

  private Z fix(final int[] s) {
    int exp = 0;
    for (int i = 1; i < s.length; ++i) {
      for (int j = 1; j < s.length; ++j) {
        exp += IntegerUtils.gcd(i, j) * s[i] * s[j];
      }
    }
    return base().pow(exp);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final IntegerPartition part = new IntegerPartition(mN);
    final int[] s = new int[mN + 1];
    int[] p;
    Q sum = Q.ZERO;
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, s);
      sum = sum.add(new Q(fix(s), SymmetricGroup.per(s)));
    }
    return sum.toZ();
  }
}

