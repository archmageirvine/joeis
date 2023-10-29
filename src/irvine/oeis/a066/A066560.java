package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066560 Smallest composite number divisible by n.
 * @author Sean A. Irvine
 */
public class A066560 extends Sequence1 {

  private Z mN = null;

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.ONE;
      return Z.FOUR;
    }
    mN = mN.add(1);
    return mN.isProbablePrime() ? mN.multiply2() : mN;
  }
}
