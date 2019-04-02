package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005720 Quadrinomial coefficients.
 * @author Sean A. Irvine
 */
public class A005720 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 1, 3).multiply(Z.valueOf(mN).add(15).multiply(mN).add(86).multiply(mN).subtract(120)).divide(120);
  }
}

