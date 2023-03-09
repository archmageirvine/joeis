package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061729 Start with 0; to get next term reverse digits and add 1 to each digit (9's get replaced by 10's).
 * @author Sean A. Irvine
 */
public class A061729 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
    } else {
      final StringBuilder sb = new StringBuilder();
      Z t = mA;
      do {
        sb.append(t.mod(10) + 1);
        t = t.divide(10);
      } while (!t.isZero());
      mA = new Z(sb);
    }
    return mA;
  }
}
