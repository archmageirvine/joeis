package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073047.
 * @author Sean A. Irvine
 */
public class A073058 extends Sequence1 {

  private final StringBuilder mA = new StringBuilder("123");
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM == mA.length()) {
      final int len = mA.length();
      for (int k = 0; k < len; ++k) {
        mA.append('1');
        if (mA.charAt(k) == '1') {
          mA.append('2');
        } else if (mA.charAt(k) == '2') {
          mA.append('3');
        }
      }
    }
    return Z.valueOf(mA.charAt(mM) - '0');
  }
}
