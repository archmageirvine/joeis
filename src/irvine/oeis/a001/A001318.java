package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A001318 Generalized pentagonal numbers: m*(3*m - 1)/2, m = 0, +-1, +-2, +-3, ....
 * @author Sean A. Irvine
 */
public class A001318 extends Sequence0 implements DirectSequence {

  private long mN = 0;
  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    mN = mN <= 0 ? 1 - mN : -mN;
    return Z.valueOf(mN).multiply(3 * mN - 1).divide2();
  }

  @Override
  // a(n) = A000217(n) - A000217(floor(n/2))
  public Z a(final Z n) {
    return Functions.TRIANGULAR.z(n).subtract(Functions.TRIANGULAR.z(n.divide2()));
  }

  @Override
  public Z a(final int n) {
    return Functions.TRIANGULAR.z(n).subtract(Functions.TRIANGULAR.z(n / 2));
  }

}
