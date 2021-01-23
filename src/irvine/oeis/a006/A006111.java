package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006111 Gaussian binomial coefficient [ n,2 ] for q=5.
 * @author Sean A. Irvine
 */
public class A006111 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 2, 5);
  }
}
