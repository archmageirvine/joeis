package irvine.oeis.a066;

import irvine.math.z.Z;

/**
 * A066683 Number of badly sieved numbers &lt;= n.
 * @author Sean A. Irvine
 */
public class A066683 extends A066680 {

  private long mT = super.next().longValueExact();
  private Z mM = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == mT) {
      mT = super.next().longValueExact();
      mM = mM.add(1);
    }
    return mM;
  }
}
