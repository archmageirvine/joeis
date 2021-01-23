package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024194 [ (4th elementary symmetric function of S(n))/(2nd elementary symmetric of S(n)) ], where S(n) = {3,4, ..., n+5}.
 * @author Sean A. Irvine
 */
public class A024194 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.multiply(15).add(450).multiply(mN).add(5165).multiply(mN).add(26922).multiply(mN).add(53848)
      .multiply(mN + 1).multiply(mN)
      .divide(n.multiply(3).add(47).multiply(mN).add(188).multiply(240));
  }
}
