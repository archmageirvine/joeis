package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061280 Smallest base b &gt;= 2 for which b^n contains n as a substring.
 * @author Sean A. Irvine
 */
public class A061280 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    Z b = Z.ONE;
    while (true) {
      b = b.add(1);
      if (b.pow(mN).toString().contains(s)) {
        return b;
      }
    }
  }
}
