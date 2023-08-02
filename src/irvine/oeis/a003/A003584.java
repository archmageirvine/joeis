package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003584 Unicursal (i.e., possessing an Eulerian path) planar rooted maps with n edges.
 * @author Sean A. Irvine
 */
public class A003584 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2L * mN, mN).multiply(6).divide(mN + 1).divide(mN + 2)
      .add(Binomial.binomial(2L * mN - 1, mN).multiply2())
      .shiftLeft(mN - 2);
  }
}
