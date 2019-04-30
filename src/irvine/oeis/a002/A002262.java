package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002262 Triangle read by rows: <code>T(n,k), 0 &lt;= k &lt;= n</code>, in which row n lists the first <code>n+1</code> nonnegative integers.
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
