package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049581 Table T(n,k) = |n-k| read by antidiagonals (n &gt;= 0, k &gt;= 0).
 * @author Sean A. Irvine
 */
public class A049581 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(Math.abs(mN - 2 * mM));
  }
}

