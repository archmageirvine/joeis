package irvine.oeis.a057;

import irvine.math.MemoryFunction2;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.HararyMultiply;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A057149 Triangle T(n,k) of n X n binary matrices with k ones, with no zero rows or columns, up to row and column permutation.
 * @author Sean A. Irvine
 */
public class A057149 extends AbstractSequence {

  /** Construct the sequence. */
  public A057149() {
    super(1);
  }

  private int mN = 0;
  private int mM = 0;

  private final MemoryFunction2<Integer, Polynomial<Q>> mCycleIndexCache = new MemoryFunction2<>() {
    @Override
    protected Polynomial<Q> compute(final Integer n, final Integer m) {
      return SymmetricGroup.create(n).cycleIndex().op(HararyMultiply.OP, SymmetricGroup.create(m).cycleIndex()).applyOnePlusXToTheN();
    }
  };

  protected Z t(final int n, final int k) {
    if (k == 0) {
      return Z.ZERO;
    }
    if (n == 1) {
      return k == 1 ? Z.ONE : Z.ZERO;
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
