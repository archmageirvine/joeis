package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006103 Gaussian binomial coefficient [ 2n,n ] for q=3.
 * @author Sean A. Irvine
 */
public class A006103 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(2 * ++mN, mN, 3);
  }
}
