package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030155 Odd n such that in n^2 the parity of digits alternates.
 * @author Sean A. Irvine
 */
public class A030155 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (A030141.isOk(mN.square())) {
        return mN;
      }
    }
  }
}
