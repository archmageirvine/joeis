package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030478.
 * @author Sean A. Irvine
 */
public class A030478 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!A030475.isMixed(mN.pow(3))) {
        return mN;
      }
    }
  }
}
