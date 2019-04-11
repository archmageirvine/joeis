package irvine.oeis.a106;

import java.util.Collections;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.BarSymmetricGroupCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.HararyMultiply;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A106498 Triangle read by rows: T(n,k) = number of unlabeled bicolored graphs with isolated nodes allowed having <code>2n</code> nodes and k edges, with n nodes of each color. Here <code>n &gt;= 0, 0 &lt;=</code> k <code>&lt;= n^2</code>.
 * @author Sean A. Irvine
 */
public class A106498 implements Sequence {

  private Polynomial<Q> mP = new Polynomial<>(Q.ZERO, Q.ONE, Collections.singletonList(Q.ONE));
  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mP.degree()) {
      mM = 0;
      ++mN;
      // Compute Z([S_n]^{S_2})
      final CycleIndex sn = SymmetricGroup.create(mN).cycleIndex();
      final CycleIndex sns2 = sn.op(HararyMultiply.OP, sn);
      final CycleIndex znp = BarSymmetricGroupCycleIndex.barSymmetricGroupCycleIndex(mN);
      sns2.add(znp);
      sns2.multiply(Q.HALF);
      mP = sns2.applyOnePlusXToTheN();
    }
    return mP.coeff(mM).toZ();
  }
}
