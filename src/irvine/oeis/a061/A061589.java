package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061589 a(1) = 11, a(n)= number obtained by adding to each digit of a(n-1) the next digit.
 * @author Sean A. Irvine
 */
public class A061589 extends Sequence1 {

  protected StringBuilder mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = new StringBuilder("11");
    } else {
      final StringBuilder sb = new StringBuilder();
      for (int k = 0; k < mA.length() - 1; ++k) {
        sb.append(mA.charAt(k) - '0' + mA.charAt(k + 1) - '0');
      }
      sb.append(1);
      mA = sb;
    }
    return new Z(mA);
  }
}
