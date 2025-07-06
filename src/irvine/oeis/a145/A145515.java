package irvine.oeis.a145;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A145515 Square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals: A(n,k) is the number of partitions of k^n into powers of k.
 * @author Sean A. Irvine
 */
public class A145515 extends Sequence0 {

  // After Alois P. Heinz

  private int mD = -1;
  private int mN = 0;
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int j, final int k) {
      if (n < 0) {
        return Z.ZERO;
      }
      if (j == 0 || n == 0 || k <= 1) {
        return Z.ONE;
      }
      if (j == 1) {
        return Z.valueOf(n + 1);
      }
      final int nn = n + 1;
      if (n >= j) {
        final Z t = Binomial.binomial(nn, j).multiply(nn - j);
        return Integers.SINGLETON.sum(0, j - 1, h -> t.multiply(Binomial.binomial(j, h)).multiply(mB.get(j - h - 1, j, k)).divide(nn - j + h).multiply(Z.NEG_ONE.pow(h)));
      } else {
        return get(n - 1, j, k).add(get(k * n, j - 1, k));
      }
    }
  };

  protected Z t(final int n, final int k) {
    return mB.get(1, n, k);
  }

  @Override
  public Z next() {
    if (++mN > mD) {
      ++mD;
      mN = 0;
    }
    return t(mN, mD - mN);
  }
}
