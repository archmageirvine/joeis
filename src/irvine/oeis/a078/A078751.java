package irvine.oeis.a078;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078751 Triangle read by rows: ss(m,k) = normalized partial derivative of (t,z)-&gt;exp(t g(z)) at (0,0), where 2 g(z)=1+exp(-2 z g(z)).
 * @author Sean A. Irvine
 */
public class A078751 extends Sequence0 {

  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Q> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Q compute(final int n, final int k) {
      if (n == 0) {
        return Q.ONE;
      }
      if (k == 1) {
        return new Q(Integers.SINGLETON.sum(1, n + 1, i -> Binomial.binomial(n + 1, i).multiply(Z.valueOf(i).pow(n)))
          .multiply(Z.NEG_ONE.pow(n)), Functions.FACTORIAL.z(n + 1).multiply2());
      }
      return Rationals.SINGLETON.sum(1, n, j -> get(n - j, k).multiply(get(j, 1)).multiply((k + 1L) * j - n)).divide(n);
    }
  };

  private Z t(final int n, final int k) {
    return mB.get(n - k, k).multiply(Functions.FACTORIAL.z(n).shiftLeft(k)).toZ().multiply(Z.NEG_ONE.pow(n - k));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
