package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033180 Numbers k such that k! contains k as a string of digits.
 * @author Sean A. Irvine
 */
public class A033180 extends Sequence1 {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      if (mF.toString().contains(String.valueOf(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
