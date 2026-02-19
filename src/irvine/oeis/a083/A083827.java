package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083827 Let x(n) = 123...n, y(n) = n...321; a(n) = y(n) concatenated with x(n) - x(n) concatenated with y(n).
 * @author Sean A. Irvine
 */
public class A083827 extends Sequence1 {

  private String mX = "";
  private String mY = "";
  private long mN = 0;

  @Override
  public Z next() {
    mX = mX + ++mN;
    mY = mN + mY;
    final Z a = new Z(mY + mX);
    final Z b = new Z(mX + mY);
    return a.subtract(b);
  }
}
