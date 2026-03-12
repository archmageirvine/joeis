package irvine.oeis.a084;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084097 Square array whose rows have e.g.f. exp(x)*cosh(sqrt(k)*x), k&gt;=0, read by ascending antidiagonals.
 * @author Sean A. Irvine
 */
public class A084097 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      return Z.ONE;
    }
    return Integers.SINGLETON.sum(0, mM / 2, j -> Binomial.binomial(mM - j, j).multiply(mM).multiply(Z.valueOf(mN - mM - 1).pow(j)).shiftRight(2 * j - mM + 1).divide(mM - j));
  }
}

