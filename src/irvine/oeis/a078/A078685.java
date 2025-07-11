package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A078685 Minimum value of |prime(n) - 2^x|.
 * @author Sean A. Irvine
 */
public class A078685 extends A000040 {

  private Z mA = Z.TWO;

  @Override
  public Z next() {
    final Z p = super.next();
    final Z d = p.subtract(mA).abs();
    final Z t = mA.multiply2();
    final Z e = t.subtract(p);
    if (e.compareTo(d) <= 0) {
      mA = t;
      return e;
    }
    return d;
  }
}

