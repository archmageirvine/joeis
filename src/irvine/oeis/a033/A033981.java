package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033981 Integers k such that <code>2^k == 7 (mod k)</code>.
 * @author Sean A. Irvine
 */
public class A033981 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.TWO.modPow(mN, mN).equals(Z.SEVEN.mod(mN))) {
        return mN;
      }
    }
  }
}
