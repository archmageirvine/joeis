package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A051710 Prime numbers associated with A058941.
 * @author Sean A. Irvine
 */
public class A051710 extends A000796 {

  private boolean mFirst = true;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return super.next(); // 3
    }
    while (true) {
      mA = mA.multiply(10).add(super.next());
      final Z t = mA.add(3);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
