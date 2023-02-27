package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061588 a(1) = 2; thereafter a(n) is the number obtained by replacing each digit of a(n-1) with its square.
 * @author Sean A. Irvine
 */
public class A061588 extends Sequence1 {

  protected StringBuilder mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = new StringBuilder("2");
    } else {
      final StringBuilder sb = new StringBuilder();
      for (int k = 0; k < mA.length(); ++k) {
        final int c = mA.charAt(k) - '0';
        sb.append(c * c);
      }
      mA = sb;
    }
    return new Z(mA);
  }
}
