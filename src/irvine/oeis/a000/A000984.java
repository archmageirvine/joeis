package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000984 Central binomial coefficients: binomial(2*n,n) = (2*n)!/(n!)^2.
 * @author Sean A. Irvine
 */
public class A000984 implements Sequence {

  private Z mV = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mV = mV.multiply(4 * mN - 2).divide(mN);
    }
    return mV;
  }
}

