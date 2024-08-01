package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005277;

/**
 * A071598 a(0) = 1; a(n) = half of the a(n-1)-th even nontotient number.
 * @author Sean A. Irvine
 */
public class A071598 extends Sequence1 {

  private final Sequence mA = new A005277();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 1;
      return Z.ONE;
    }
    Z t = Z.ZERO;
    while (mM < mN) {
      t = mA.next();
      ++mM;
    }
    t = t.divide2();
    mN = t.longValueExact();
    return t;
  }
}

