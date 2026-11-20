package irvine.oeis.a087;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A087502 Smallest positive integer which when written in base n is doubled when the last digit is put first.
 * @author Sean A. Irvine
 */
public class A087502 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    long d = 1;
    Z a = Z.valueOf(mN);
    while (a.compareTo(mN) >= 0) {
      a = new Q(Z.ONE.shiftLeft(++d).subtract(1), 2 * mN - 1).den();
    }
    return Z.TWO.max(a).multiply(Z.valueOf(mN).pow(d).subtract(1)).divide(2 * mN - 1);
  }
}

