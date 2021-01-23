package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024363 Number of primitive Pythagorean triangles with side n.
 * @author Sean A. Irvine
 */
public class A024363 extends A024357 {

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
