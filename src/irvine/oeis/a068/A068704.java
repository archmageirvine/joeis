package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068701.
 * @author Sean A. Irvine
 */
public class A068704 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final StringBuilder sb = new StringBuilder("1");
    Z m = mN;
    while (true) {
      sb.insert(0, m);
      final Z t = new Z(sb);
      if (t.isProbablePrime()) {
        return t;
      }
      m = m.multiply(mN);
    }
  }
}
