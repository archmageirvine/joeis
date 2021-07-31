package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a047.A047884;

/**
 * A049400 Partial sums of rows of A047884. Young Tableaux by height.
 * @author Sean A. Irvine
 */
public class A049400 extends A047884 {

  private long mN = 0;
  private long mM = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mSum = Z.ZERO;
    }
    mSum = mSum.add(super.next());
    return mSum;
  }
}

