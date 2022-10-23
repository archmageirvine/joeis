package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A006990 Largest prime &lt;= n!.
 * @author Sean A. Irvine
 */
public class A006990 extends Sequence2 {

  private Z mF = Z.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    Z m = mF;
    while (true) {
      if (m.isProbablePrime()) {
        return m;
      }
      m = m.subtract(1);
    }
  }
}

