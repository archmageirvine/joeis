package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a005.A005277;

/**
 * A071573 a(1) = 1; a(n) = a(n-1)-th nontotient number.
 * @author Sean A. Irvine
 */
public class A071573 extends A005277 {

  private long mA = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (mA == 0) {
      mA = 1;
      return Z.ONE;
    }
    Z t = Z.ZERO;
    while (mM < mA) {
      t = super.next();
      ++mM;
    }
    mA = t.longValueExact();
    return t;
  }
}

