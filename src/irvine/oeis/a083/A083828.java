package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083828 Let x(n) = 123...n, y(n) = n...321; c(n) = delete the least significant digit of y(n) and concatenate with x(n); d(n) = delete the least significant digit of x(n) and concatenate with y(n). a(n) = c(n) - d(n).
 * @author Sean A. Irvine
 */
public class A083828 extends Sequence1 {

  private String mX = "";
  private String mY = "";
  private long mN = 0;

  @Override
  public Z next() {
    mX = mX + ++mN;
    mY = mN + mY;
    final Z a = new Z(mY.substring(0, mY.length() - 1) + mX);
    final Z b = new Z(mX.substring(0, mX.length() - 1) + mY);
    return a.subtract(b);
  }
}
