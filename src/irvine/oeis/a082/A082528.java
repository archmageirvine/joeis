package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082528 Least k such that x(k)=0 where x(1)=n x(k)=k^3*floor(x(k-1)/k^3).
 * @author Sean A. Irvine
 */
public class A082528 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    Z x = Z.valueOf(++mN);
    long k = 1;
    while (!x.isZero()) {
      final Z k3 = Z.valueOf(++k).pow(3);
      x = x.divide(k3).multiply(k3);
    }
    return Z.valueOf(k);
  }
}
