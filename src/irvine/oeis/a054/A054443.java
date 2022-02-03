package irvine.oeis.a054;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054443 Third convolution of A001405 (central binomial numbers).
 * @author Sean A. Irvine
 */
public class A054443 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    final int k = ++mN / 2;
    if ((mN & 1) == 1) {
      return Z.valueOf(k + 4).shiftLeft(2 * k + 4).subtract(Binomial.binomial(2L * (k + 3), k + 3).multiply(k + 3));
    } else {
      return Z.valueOf(2 * k + 7).shiftLeft(2 * k + 2).subtract(Binomial.binomial(2L * (k + 2), k + 2).multiply(4L * k + 9).divide2());
    }
  }
}
