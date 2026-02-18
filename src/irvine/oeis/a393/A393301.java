package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393301 allocated for Scott R. Shannon.
 * @author Sean A. Irvine
 */
public class A393301 extends Sequence1 {

  private final StringBuilder mA = new StringBuilder();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (mA.length() == 0) {
      mA.append(0);
      return Z.ZERO;
    }
    while (true) {
      mF = mF.multiply(++mN);
      final String s = mF.toString();
      if (s.contains(mA)) {
        mA.append(mN);
        return Z.valueOf(mN);
      }
    }
  }
}
