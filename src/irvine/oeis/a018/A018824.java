package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018824 n is the sum of k nonzero squares for all 5 &lt;= k &lt;= n-14 (contains all integers &gt;= 19 except 33).
 * @author Sean A. Irvine
 */
public class A018824 implements Sequence {

  // Could be done as an extension of A018820 (cf. A018823), but 33 is the only
  // missing number, so ...

  private long mN = 18;

  @Override
  public Z next() {
    if (++mN == 33) {
      ++mN;
    }
    return Z.valueOf(mN);
  }
}
