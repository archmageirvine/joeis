package irvine.oeis.a092;

import irvine.math.z.Z;
import irvine.oeis.a007.A007417;

/**
 * A092401 List of pairs n, 3n, where n is the least unused number so far.
 * @author Georg Fischer
 */
public class A092401 extends A007417 {

  private int mN = 0;
  private Z mA;

  @Override
  public Z next() {
    // a(2n-1) = A007417(n), a(2n) = 3*A007417(n).
    ++mN;
    if ((mN & 1) == 1) {
      mA = super.next();
      return mA;
    }
    return mA.multiply(3);
  }
}
