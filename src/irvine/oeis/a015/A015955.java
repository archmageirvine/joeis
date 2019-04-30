package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015955 Numbers n such that <code>n | 8^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A015955 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z m = mN;
      mN = mN.add(1);
      if (Z.EIGHT.modPow(mN, mN).equals(m)) {
        return mN;
      }
    }
  }
}
