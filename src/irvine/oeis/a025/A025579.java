package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025579 a(1)=1, a(2)=2, a(n) = 4*3^(n-3) for n &gt;= 3.
 * @author Sean A. Irvine
 */
public class A025579 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (mA.equals(Z.ONE)) {
      mA = Z.TWO;
    } else if (mA.equals(Z.TWO)) {
      mA = Z.FOUR;
    } else {
      mA = mA.multiply(3);
    }
    return mA;
  }
}
