package irvine.oeis.a057;

import irvine.math.MemoryFunction2;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.HararyMultiply;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057149.
 * @author Sean A. Irvine
 */
public class A057149 implements Sequence {

  private int mN = 0;
  private int mM = 0;

  private final MemoryFunction2<Integer, Polynomial<Q>> mCycleIndexCache = new MemoryFunction2<>() {
    @Override
    protected Polynomial<Q> compute(final Integer n, final Integer m) {
      return SymmetricGroup.create(n).cycleIndex().op(HararyMultiply.OP, SymmetricGroup.create(m).cycleIndex()).applyOnePlusXToTheN();
    }
  };

  private Z t(final int n, final int k) {
    if (k == 0) {
      return Z.ZERO;
    }
    if (n == 1) {
      return Z.ONE;
    }
    final Q a = mCycleIndexCache.get(n, n).coeff(k);
    final Q b = mCycleIndexCache.get(n - 1, n - 1).coeff(k);
    final Q c = mCycleIndexCache.get(n, n - 1).coeff(k);
    return a.add(b).subtract(c.multiply(Q.TWO)).toZ();
  }

  @Override
  public Z next() {
    if (++mM > mN * mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
