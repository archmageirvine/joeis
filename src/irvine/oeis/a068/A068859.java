package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068859 a(1) = 3 = 1*3; a(n) = smallest multiple of a(n-1) which is of the form k(k+2).
 * @author Sean A. Irvine
 */
public class A068859 extends Sequence0 {

  private Z mA = null;

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.THREE;
    } else {
      Z t = mA;
      while (true) {
        t = t.add(mA);
        final Z s = t.add(1).sqrt().subtract(1);
        if (t.equals(s.multiply(s.add(2))) || t.equals(s.multiply(s.subtract(2)))) {
          mA = t;
          break;
        }
      }
    }
    return mA;
  }
}
