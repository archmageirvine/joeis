package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001318 Generalized pentagonal numbers: m*(3*m <code>- 1)/2,</code> m <code>= 0, +-1, +-2, +-3, ...</code>.
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
    return Z.valueOf(mN).multiply(3 * mN - 1).divide(2);
  }
}
