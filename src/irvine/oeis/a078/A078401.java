package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078401 Triangle read by rows: T(n,k) = number of numbers &lt;= k that are coprime to n, 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A078401 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private long mCnt = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      mCnt = 0;
    }
    if (Functions.GCD.l(mN, mM) == 1) {
      ++mCnt;
    }
    return Z.valueOf(mCnt);
  }
}

