package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071762 Leftmost 1 is converted to a 2, which then propagates one step at a time until it is rightmost; then it changes to a pair of 1's and the process repeats.
 * @author Sean A. Irvine
 */
public class A071762 extends Sequence0 {

  private String mA = null;
  private int mN = 0;

  @Override
  public Z next() {
    if (mA == null) {
      mA = "";
      return Z.ZERO;
    }
    if (++mN >= mA.length()) {
      mA = mA + "1";
      mN = -1;
      return new Z(mA);
    }
    return new Z(mA.substring(0, mN) + "2" + mA.substring(mN + 1));
  }
}
