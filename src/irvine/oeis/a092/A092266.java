package irvine.oeis.a092;

import irvine.math.z.Z;
import irvine.oeis.a002.A002894;

/**
 * A092266 Expansion of (1+4x)/AGM(1+4x,1-4x) where AGM denotes the arithmetic-geometric mean.
 * @author Georg Fischer
 */
public class A092266 extends A002894 {

  private int mN = -1;
  private Z mA;

  @Override
  public Z next() {
    // a(2n) = A002894(n); a(2n+1) = 4*a(2n).
    ++mN;
    if ((mN & 1) == 0) {
      mA = super.next();
      return mA;
    }
    return mA.multiply(4);
  }
}
