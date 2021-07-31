package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030151 Numbers k such that in k^2 the parity of digits alternates.
 * @author Sean A. Irvine
 */
public class A030151 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (A030141.isOk(mN.square())) {
        return mN;
      }
    }
  }
}
