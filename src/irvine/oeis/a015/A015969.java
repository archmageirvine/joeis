package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015969.
 * @author Sean A. Irvine
 */
public class A015969 implements Sequence {

  private static final Z Z16 = Z.valueOf(16);
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z m = mN;
      mN = mN.add(1);
      if (Z16.modPow(mN, mN).equals(m)) {
        return mN;
      }
    }
  }
}
