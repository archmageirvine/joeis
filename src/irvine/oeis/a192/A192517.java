package irvine.oeis.a192;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.RedfieldExponentiation;
import irvine.math.polynomial.StandardMultiply;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A192517 Table read by antidiagonals: T(n,k) = number of multigraphs with n vertices and k edges, with no loops allowed <code>(n &gt;= 1,</code> k <code>&gt;= 0)</code>.
 * @author Sean A. Irvine
 */
public class A192517 implements Sequence {

  private static final CycleIndex Z2 = SymmetricGroup.create(2).cycleIndex();
  private int mN = 0;
  private int mM = 0;

  private Z t(final int n, final int m) {
    if (m == 0 || n == 2) {
      return Z.ONE;
    }
    if (n == 1) {
      return Z.ZERO;
    }
    final CycleIndex sm = SymmetricGroup.create(m).cycleIndex();
    final CycleIndex ci = Z2.op(StandardMultiply.OP, SymmetricGroup.create(n - 2).cycleIndex());
    return RedfieldExponentiation.count(ci, sm);
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
