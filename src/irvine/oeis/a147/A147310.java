package irvine.oeis.a147;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A147310 Irregular triangle read by rows, for even columns: T(n, 2*k) = (-1)^k*A152198(n, k) and odd columns T(n, 2*k+1) = 0.
 * @author Sean A. Irvine
 */
public class A147310 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM >= (mN | 1)) {
      ++mN;
      mM = 0;
    }
    if ((mM & 1) == 1) {
      return Z.ZERO;
    }
    return Binomial.binomial(mN / 2, mM / 2).multiply(Z.NEG_ONE.pow(mM / 2));
  }
}

