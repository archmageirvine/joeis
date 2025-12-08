package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082404 Triangle in which n-th row gives trajectory of n under the map x -&gt; x/2 if x is even, x -&gt; x-1 if x is odd, stopping when we reach 1.
 * @author Sean A. Irvine
 */
public class A082404 extends Sequence1 {

  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    if (mM == 1) {
      mM = ++mN;
    } else if ((mM & 1) == 0) {
      mM /= 2;
    } else {
      --mM;
    }
    return Z.valueOf(mM);
  }
}
