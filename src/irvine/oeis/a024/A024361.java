package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024361 Number of primitive Pythagorean triangles with leg n.
 * @author Sean A. Irvine
 */
public class A024361 extends A024355 {

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
