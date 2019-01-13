package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005719.
 * @author Sean A. Irvine
 */
public class A005719 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN, 2).multiply(Z.valueOf(mN).add(11).multiply(mN).add(46).multiply(mN).subtract(24)).divide(60);
  }
}
