package irvine.oeis.a082;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082170 Deterministic completely defined quasi-acyclic automata with 3 inputs, n transient and k absorbing labeled states.
 * @author Sean A. Irvine
 */
public class A082170 extends Sequence0 {

  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      return n == 0 ? Z.ONE : Integers.SINGLETON.sum(0, n - 1, k -> Binomial.binomial(n, k).multiply(Z.NEG_ONE.pow(n - k - 1)).multiply(Z.valueOf(k + m).pow(3L * (n - k))).multiply(mB.get(k, m)));
    }
  };

  /**
   * Get a value of the T3 function.
   * @param n first parameter
   * @param m second parameter
   * @return value
   */
  public Z t(final int n, final int m) {
    return mB.get(n, m);
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}

