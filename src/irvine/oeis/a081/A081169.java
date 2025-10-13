package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080825.
 * @author Sean A. Irvine
 */
public class A081169 extends Sequence1 {

  private long mN = 0;
  private long mM = 1;
  private boolean mEnd = true;

  @Override
  public Z next() {
    if (mEnd && (mM == 1 || mM == 5 || mM == 17)) {
      mM = ++mN;
      mEnd = false;
      return Z.valueOf(mM);
    }
    mEnd = true;
    mM = (mM & 1) == 0 ? mM / 2 : 3 * mM - 1;
    return Z.valueOf(mM);
  }
}

