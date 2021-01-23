package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025192 a(0)=1; a(n) = 2*3^(n-1) for n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A025192 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (mA.equals(Z.ONE)) {
      mA = Z.TWO;
    } else {
      mA = mA.multiply(3);
    }
    return mA;
  }
}
