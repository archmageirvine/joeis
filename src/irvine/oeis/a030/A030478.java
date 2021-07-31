package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030478 Numbers n such that n^3 has property that all even digits occur together and all odd digits occur together.
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
