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
 * A106498.
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
