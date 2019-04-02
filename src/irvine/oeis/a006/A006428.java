package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006428 Number of tree-rooted planar maps with 3 vertices and n faces.
 * @author Sean A. Irvine
 */
public class A006428 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
//    return Binomial.binomial(mN, mN).multiply(3)
//      .add(Binomial.binomial(mN, mN - 1).multiply(33))
//      .add(Binomial.binomial(mN, mN - 2).multiply(66))
//      .add(Binomial.binomial(mN, mN - 3).multiply(60))
//      .add(Binomial.binomial(mN, mN - 4).multiply(27))
//      .add(Binomial.binomial(mN, mN - 5).multiply(5));
    return Z.valueOf(mN).add(7).multiply(mN).add(17).multiply(mN).subtract(31).multiply(mN).subtract(42).multiply(mN).divide(24);
  }
}
