package irvine.oeis.a212;

import irvine.math.cc.CC;
import irvine.math.cc.ComputableComplexField;
import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A212801 Square array read by antidiagonals: T(m,n) = number of Eulerian circuits in the Cartesian product of two directed cycles of lengths m and n.
 * @author Sean A. Irvine
 */
public class A212801 extends MemoryFunction2Sequence<Long, CC> {

  /** Construct the sequence. */
  public A212801() {
    super(1);
  }

  private static final ComputableComplexField CCF = ComputableComplexField.SINGLETON;
  private static final CC TAU_I = CCF.multiply(CC.I, CR.TAU);
  private static final CC EXP_TAU_I = CCF.exp(TAU_I);

  private long mN = 0;
  private long mM = 0;

  // Root of unity
  @Override
  protected CC compute(final Long h, final Long m) {
    return h.equals(m) ? EXP_TAU_I : CCF.exp(CCF.multiply(TAU_I, CR.valueOf(new Q(h, m))));
  }

  protected Z t(final long m, final long n) {
    if (m > n) {
      return t(n, m); // exploit symmetry
    }
    CC prod = CC.ONE;
    for (long k = 1; k < n; ++k) {
      final CC a = CCF.subtract(CC.TWO, get(k, n));
      for (long h = 1; h < m; ++h) {
        prod = CCF.multiply(prod, CCF.subtract(a, get(h, m)));
      }
    }
    return prod.re().toZ();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN - mM + 1, mM);
  }

}
