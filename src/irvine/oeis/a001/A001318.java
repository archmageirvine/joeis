package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001318 Generalized pentagonal numbers: m*(3*m - 1)/2, m = 0, +-1, +-2, +-3, ....
 * @author Sean A. Irvine
 */
public class A001318 implements Sequence {

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
}
