package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A039647 Related to A000032 (Lucas numbers): (n-1)!*L(n).
 * @author Sean A. Irvine
 */
public class A039647 extends A000032 {

  {
    setOffset(1);
    super.next();
  }
  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return super.next().multiply(mF);
  }
}
