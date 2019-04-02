package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006430 Number of tree-rooted planar maps with 5 vertices and n faces.
 * @author Sean A. Irvine
 */
public class A006430 implements Sequence {

  private long mN = -2;

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.ZERO;
    }
    return Binomial.binomial(mN, mN).multiply(5)
      .add(Binomial.binomial(mN, mN - 1).multiply(355))
      .add(Binomial.binomial(mN, mN - 2).multiply(6635))
      .add(Binomial.binomial(mN, mN - 3).multiply(52725))
      .add(Binomial.binomial(mN, mN - 4).multiply(222453))
      .add(Binomial.binomial(mN, mN - 5).multiply(585145))
      .add(Binomial.binomial(mN, mN - 6).multiply(1042982))
      .add(Binomial.binomial(mN, mN - 7).multiply(1314466))
      .add(Binomial.binomial(mN, mN - 8).multiply(1192736))
      .add(Binomial.binomial(mN, mN - 9).multiply(778788))
      .add(Binomial.binomial(mN, mN - 10).multiply(358665))
      .add(Binomial.binomial(mN, mN - 11).multiply(111037))
      .add(Binomial.binomial(mN, mN - 12).multiply(20820))
      .add(Binomial.binomial(mN, mN - 13).multiply(1794))
      ;
  }
}
