package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a020.A020884;

/**
 * A024359 Number of primitive Pythagorean triangles with short leg n.
 * @author Sean A. Irvine
 */
public class A024359 extends A020884 {

  private Z mA = super.next();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    long c = 0;
    mN = mN.add(1);
    while (mN.equals(mA)) {
      ++c;
      mA = super.next();
    }
    return Z.valueOf(c);
  }
}
