package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A080825 Triangle read by rows in which n-th row gives trajectory of n (omitting n itself) under the map k -&gt; k-1 if k odd, k -&gt; k/2 if k even.
 * @author Sean A. Irvine
 */
public class A080825 extends Sequence2 {

  private long mN = 2;
  private long mM = 2;

  @Override
  public Z next() {
    if (mM == 1) {
      mM = ++mN;
    }
    mM = (mM & 1) == 0 ? mM / 2 : mM - 1;
    return Z.valueOf(mM);
  }
}

