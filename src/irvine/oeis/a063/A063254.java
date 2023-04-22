package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a062.A062410;

/**
 * A063254 Values of A062410 on folding point positions of the spiral.
 * @author Sean A. Irvine
 */
public class A063254 extends A062410 {

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
