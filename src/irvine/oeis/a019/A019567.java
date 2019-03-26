package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019567.
 * @author Sean A. Irvine
 */
public class A019567 implements Sequence {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(4);
    Z m = Z.ZERO;
    while (true) {
      m = m.add(1);
      final Z mod = Z.TWO.modPow(m, mN);
      if (mod.equals(Z.ONE) || mod.equals(mN.subtract(1))) {
        return m;
      }
    }
  }
}
