package irvine.oeis.a188;

import irvine.math.z.Z;
import irvine.oeis.a000.A000110;

/**
 * A188164 Number of palindromic structures of length n.
 * @author Georg Fischer
 */
public class A188164 extends A000110 {

  private int mN = -1;
  private Z mA;

  {
    mA = super.next();
  }

  @Override
  public Z next() {
    // a(2n) = a(2n-1) = B(n), where B(n) = A000110(n)
    ++mN;
    if ((mN & 1) == 1) {
      mA = super.next();
    }
    return mA;
  }
}
