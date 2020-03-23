package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030155 Odd n such that in <code>n^2</code> the parity of digits alternates.
 * @author Sean A. Irvine
 */
public class A030155 implements Sequence {

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
