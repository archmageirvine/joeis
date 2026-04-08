package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084361 a(1) = 1; a(n+1) is the least prime of the form (2^k)*a(n)+-1, for some positive k.
 * @author Sean A. Irvine
 */
public class A084361 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      Z t = mA;
      while (true) {
        t = t.multiply2();
        final Z m = t.subtract(1);
        if (m.isProbablePrime()) {
          mA = m;
          break;
        }
        final Z p = t.add(1);
        if (p.isProbablePrime()) {
          mA = p;
          break;
        }
      }
    }
    return mA;
  }
}
