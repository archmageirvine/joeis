package irvine.oeis.a063;

import irvine.math.z.Z;

/**
 * A063253 Values of A063178 on folding point positions of the spiral.
 * @author Sean A. Irvine
 */
public class A063253 extends A063178 {

  {
    setOffset(1);
    super.next();
  }
  private Z mA = super.next();

  @Override
  public Z next() {
    final int dir = mDir;
    Z u;
    do {
      u = mA;
      mA = super.next();
    } while (dir == mDir);
    return u;
  }
}
