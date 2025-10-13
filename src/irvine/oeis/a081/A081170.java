package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A080825.
 * @author Sean A. Irvine
 */
public class A081170 extends Sequence3 {

  private long mN = 2;
  private long mM = 1;
  private boolean mEnd = true;

  @Override
  public Z next() {
    if (mEnd && (mM == 0 || mM == 1)) {
      mM = ++mN;
      mEnd = false;
      return Z.valueOf(mM);
    }
    mEnd = true;
    mM = (mM & 1) == 0 ? mM / 2 : mM - 3;
    return Z.valueOf(mM);
  }
}

