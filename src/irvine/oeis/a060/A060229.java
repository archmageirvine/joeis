package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060229 Smaller member of a twin prime pair whose mean is a multiple of A002110(3)=30.
 * @author Sean A. Irvine
 */
public class A060229 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(30);
      if (mN.isProbablePrime() && mN.add(2).isProbablePrime()) {
        return mN;
      }
    }
  }
}
