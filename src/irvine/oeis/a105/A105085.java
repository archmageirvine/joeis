package irvine.oeis.a105;
// manually inbase2 at 2022-04-08 21:48

import irvine.math.z.Z;
import irvine.oeis.a102.A102370;

/**
 * A105085 Write the terms of A102370 in base 2, read by upward-sloping diagonals and convert to base 10.
 * <code>a(2n) = 2*A102370(n+1), a(2n+1) = a(2n) + 1.</code>
 * @author Georg Fischer
 */
public class A105085 extends A102370 {

  private int mN = -1;
  private Z mA2;

  {
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 0) {
      mA2 = super.next().multiply2();
      return mA2;
    }
    return mA2.add(1);
  }
}
