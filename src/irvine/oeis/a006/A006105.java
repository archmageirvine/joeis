package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006105.
 * @author Sean A. Irvine
 */
public class A006105 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 2, 4);
  }
}
