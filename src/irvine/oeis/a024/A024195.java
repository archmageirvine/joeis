package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024195 Integer part of (4th elementary symmetric function of S(n))/(3rd elementary symmetric of S(n)), where S(n) = {3,4, ..., n+5}.
 * @author Sean A. Irvine
 */
public class A024195 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.multiply(15).add(450).multiply(mN).add(5165).multiply(mN).add(26922).multiply(mN).add(53848)
      .multiply(mN)
      .divide(n.add(15).multiply(mN).add(60).multiply(mN + 8).multiply(120));
  }
}

