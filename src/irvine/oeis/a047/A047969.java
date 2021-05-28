package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047969 Square array of nexus numbers a(n,k) = (n+1)^(k+1) - n^(k+1) (n &gt;= 0, k &gt;= 0) read by upwards antidiagonals.
 * @author Sean A. Irvine
 */
public class A047969 implements Sequence {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(mN - mM + 1).pow(mM + 1).subtract(Z.valueOf(mN - mM).pow(mM + 1));
  }
}
