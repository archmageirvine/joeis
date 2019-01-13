package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006418.
 * @author Sean A. Irvine
 */
public class A006418 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
//    return Binomial.binomial(mN, mN).multiply(1)
//      .add(Binomial.binomial(mN, mN - 1).multiply(37))
//      .add(Binomial.binomial(mN, mN - 2).multiply(394))
//      .add(Binomial.binomial(mN, mN - 3).multiply(1714))
//      .add(Binomial.binomial(mN, mN - 4).multiply(3474))
//      .add(Binomial.binomial(mN, mN - 5).multiply(3966))
//      .add(Binomial.binomial(mN, mN - 6).multiply(2723))
//      .add(Binomial.binomial(mN, mN - 7).multiply(1117))
//      .add(Binomial.binomial(mN, mN - 8).multiply(252))
//      .add(Binomial.binomial(mN, mN - 9).multiply(24));
    return Z.TWO.multiply(mN).add(117)
      .multiply(mN).add(2502)
      .multiply(mN).add(25410)
      .multiply(mN).add(131250)
      .multiply(mN).add(322833)
      .multiply(mN).add(261238)
      .multiply(mN).subtract(15720)
      .multiply(mN).add(391248)
      .multiply(mN).add(30240)
      .divide(30240);
  }
}
