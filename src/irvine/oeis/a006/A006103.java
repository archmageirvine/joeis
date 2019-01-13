package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006103.
 * @author Sean A. Irvine
 */
public class A006103 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(2 * ++mN, mN, 3);
  }
}
