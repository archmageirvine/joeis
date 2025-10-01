package irvine.oeis.a080;

import irvine.math.z.Z;

/**
 * A080818 Triangle read by rows in which the n-th row contains n distinct numbers whose sum is the smallest square.
 * @author Sean A. Irvine
 */
public class A080818 extends A080817 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mM == mN ? super.next() : Z.valueOf(mM);
  }
}
