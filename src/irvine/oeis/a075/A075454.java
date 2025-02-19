package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a001.A001597;

/**
 * A075454 Integer averages of two successive perfect powers (pp(n) + pp(n+1))/2.
 * @author Sean A. Irvine
 */
public class A075454 extends A001597 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      final Z u = t.add(mA);
      if (u.isEven()) {
        return u.divide2();
      }
    }
  }
}
