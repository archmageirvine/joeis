package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081491 Triangle read by rows in which the n-th row contains n terms of an arithmetic progression with a common difference of (n-1) and the first term of (n+1)-th row is 1 more than the last term of the n-th row.
 * @author Sean A. Irvine
 */
public class A081491 extends Sequence1 {

  private long mA = 0;
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      ++mA;
      mM = 0;
    } else {
      mA += mN - 1;
    }
    return Z.valueOf(mA);
  }
}
