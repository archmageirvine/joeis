package irvine.oeis.a049;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049383 Iterated binomial coefficients.
 * @author Sean A. Irvine
 */
public class A049383 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z top = mN;
    for (Z bottom = mN.subtract(1); !bottom.isZero(); bottom = bottom.subtract(1)) {
      top = Binomial.binomial(top, bottom);
    }
    return top;
  }
}
