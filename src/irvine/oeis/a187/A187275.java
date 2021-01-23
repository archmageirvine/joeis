package irvine.oeis.a187;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A187275 a(n) = (n/4)*5^(n/2)*((1+sqrt(5))^2+(-1)^n*(1-sqrt(5))^2).
 * @author Sean A. Irvine
 */
public class A187275 implements Sequence {

  private Z mFives = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      return mFives.multiply(3L * mN);
    } else {
      mFives = mFives.multiply(5);
      return mFives.multiply(mN);
    }
  }
}
