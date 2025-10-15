package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081171 Triangle in which n-th row gives trajectory of n (including n itself) under the map x -&gt; x/2 if x is even, x -&gt; 3x-3 if x is odd, stopping when reaching one of 1, 3, 5, 15, 51.
 * @author Sean A. Irvine
 */
public class A081171 extends Sequence1 {

  private long mN = 0;
  private long mM = 1;
  private boolean mEnd = true;

  @Override
  public Z next() {
    if (mEnd && (mM <= 0 || mM == 1 || mM == 3 || mM == 5 || mM == 15 || mM == 51)) {
      mM = ++mN;
      mEnd = false;
      return Z.valueOf(mM);
    }
    mEnd = true;
    mM = (mM & 1) == 0 ? mM / 2 : Math.max(mM - 3, 0);
    return Z.valueOf(mM);
  }
}

