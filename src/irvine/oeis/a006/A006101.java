package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006101 Gaussian binomial coefficient [ n,3 ] for q=3.
 * @author Sean A. Irvine
 */
public class A006101 implements Sequence {

  private int mN = 2;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 3, 3);
  }
}
