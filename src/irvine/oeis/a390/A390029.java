package irvine.oeis.a390;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390029 Triangle read by rows: T(n,k) = Sum_{j=0..2k} (-1)^j * binomial(2k,j) * (2+k-j)^(2n).
 * @author Sean A. Irvine
 */
public class A390029 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Integers.SINGLETON.sum(0, 2 * mM, j -> Z.NEG_ONE.pow(j).multiply(Binomial.binomial(2L * mM, j)).multiply(Z.valueOf(2 + mM - j).pow(2L * mN)));
  }
}

