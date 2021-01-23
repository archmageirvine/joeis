package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002262 Triangle read by rows: T(n,k), 0 &lt;= k &lt;= n, in which row n lists the first n+1 nonnegative integers.
 * @author Sean A. Irvine
 */
public class A002262 implements Sequence {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(mM);
  }
}
