package irvine.oeis.a386;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A386681 Triangle read by rows: T(n,k) is the number of closed binary operations on a set of n labeled elements with a closed center of size k.
 * @author Sean A. Irvine
 */
public class A386681 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  protected Z t(final int n, final int k) {
    return Integers.SINGLETON.sum(0, n - k, j -> Z.NEG_ONE.pow(j).multiply(Binomial.binomial(n - k, j)).multiply(Z.valueOf(n).pow(Binomial.binomial(j + 1, 2).add((long) (n - k) * (n - j)))))
      .multiply(Z.valueOf(k).pow(Binomial.binomial(k + 1, 2)))
      .multiply(Binomial.binomial(n, k));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
