package irvine.oeis.a068;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068518 The sequence S(n,-3,1,1), where S(n,k,t,q) is defined by Sum_{j=0..n} binomial(n+q,j)^t * B(j,k) and B(j,k) is the j-th k-poly-Bernoulli number.
 * @author Sean A. Irvine
 */
public class A068518 extends Sequence0 {

  private int mN = -1;

  private Z t(final int k, final int j) {
    return Integers.SINGLETON.sum(0, j, i -> Z.NEG_ONE.pow(i).multiply(Binomial.binomial(j, i).multiply(Z.valueOf(i).pow(k))));
  }

  private Z b(final int k) {
    return Z.NEG_ONE.pow(k)
      .multiply(Integers.SINGLETON.sum(0, k, j -> t(k, j).multiply(Z.valueOf(j + 1).pow(3))));
  }

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> Binomial.binomial(mN + 1, k).multiply(b(k)));
  }
}

