package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033180 Numbers n such that <code>n!</code> contains n as a string of digits.
 * @author Sean A. Irvine
 */
public class A033180 implements Sequence {

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
