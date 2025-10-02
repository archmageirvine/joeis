package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080816.
 * @author Sean A. Irvine
 */
public class A080842 extends Sequence1 {

  private long mN = 1;
  private long mM = 2;

  @Override
  public Z next() {
    if (mN == 1) {
      ++mN;
      return Z.ONE;
    }
    if (mM == 1) {
      mM = ++mN;
    }
    mM = mM % 3 == 0 ? mM / 3 : mM + 1;
    return Z.valueOf(mM);
  }
}

