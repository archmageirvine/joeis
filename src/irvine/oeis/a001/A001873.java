package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A001873.
 * @author Sean A. Irvine
 */
public class A001873 extends A000045 {

  private static final Z FIFTEEN = Z.valueOf(15);


  {
    super.next();
  }


  private long mN = -1;
  private Z mB = super.next();

  @Override
  public Z next() {
    ++mN;
    final Z mA = mB;
    mB = super.next();
    final Z p = FIFTEEN.multiply(mN).add(230).multiply(mN).add(1185).multiply(mN).add(2338).multiply(mN).add(1368);
    final Z q = Z.TEN.multiply(mN).add(160).multiply(mN).add(890).multiply(mN).add(2036).multiply(mN).add(1632);
    return mB.multiply(p).add(mA.multiply(q)).divide(3000);
  }
}
