package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030159 Numbers n such that in n^3 the parity of digits alternates.
 * @author Sean A. Irvine
 */
public class A030159 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (A030141.isOk(mN.pow(3))) {
        return mN;
      }
    }
  }
}
