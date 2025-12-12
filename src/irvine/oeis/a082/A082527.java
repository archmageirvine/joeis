package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082527 Least k such that x(k)=0 where x(1)=n x(k)=k^2*floor(x(k-1)/k^2).
 * @author Sean A. Irvine
 */
public class A082527 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    Z x = Z.valueOf(++mN);
    long k = 1;
    while (!x.isZero()) {
      ++k;
      x = x.divide(k * k).multiply(k * k);
    }
    return Z.valueOf(k);
  }
}
