package irvine.oeis.a082;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082172 A subclass of quasi-acyclic automata with 3 inputs, n transient and k absorbing labeled states.
 * @author Sean A. Irvine
 */
public class A082172 extends Sequence0 {

  private int mN = 0;
  private int mM = 0;
  /** S3 function. */
  public final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      return n == 0 ? Z.ONE : Integers.SINGLETON.sum(0, n - 1, k -> Binomial.binomial(n, k).multiply(Z.NEG_ONE.pow(n - k - 1)).multiply(Z.valueOf(k + m + 1).pow(3).subtract(1).pow(n - k)).multiply(mB.get(k, m)));
    }
  };

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mM, mN - mM);
  }
}

