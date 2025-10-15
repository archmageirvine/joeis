package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A081170 Triangle in which n-th row gives trajectory of n (including n itself) under the map x -&gt; x/2 if x is even, x -&gt; x-3 if x is odd, stopping when reach 0 or 1.
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

