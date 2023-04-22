package irvine.oeis.a063;

import irvine.math.z.Z;

/**
 * A063255 Values of A063177 on folding point positions of the spiral.
 * @author Sean A. Irvine
 */
public class A063255 extends A063177 {

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
