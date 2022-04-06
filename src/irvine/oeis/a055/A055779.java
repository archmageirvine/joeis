package irvine.oeis.a055;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055779 Number of fat trees on n labeled vertices.
 * @author Sean A. Irvine
 */
public class A055779 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> Binomial.binomial(mN, k).multiply(Z.valueOf(k).pow(mN - k)).multiply(Z.valueOf(mN).pow(k))).divide(mN).divide(mN);
  }
}
