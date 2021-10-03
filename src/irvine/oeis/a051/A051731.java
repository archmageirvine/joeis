package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051731 Triangle read by rows: T(n,k) = 1 if k divides n, T(n,k) = 0 otherwise (for n &gt;= 1 and 1 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A051731 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mN % mM == 0 ? Z.ONE : Z.ZERO;
  }
}
