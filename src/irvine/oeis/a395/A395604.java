package irvine.oeis.a395;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395604 Triangle read by rows: T(n,k) = Sum_{j=0..k} (-1)^j * binomial(k,j) * (4-j)^n.
 * @author Sean A. Irvine
 */
public class A395604 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Integers.SINGLETON.sum(0, mM, k -> Binomial.binomial(mM, k).multiply(Z.valueOf(4 - k).pow(mN)).multiply(Z.NEG_ONE.pow(k)));
  }
}

