package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048152 Triangular array T read by rows: T(n,k) = k^2 mod n, for 1 &lt;= k &lt;= n, n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A048152 implements Sequence {

  private Z mN = Z.ZERO;
  private Z mM = Z.ZERO;

  @Override
  public Z next() {
    mM = mM.add(1);
    if (mM.compareTo(mN) > 0) {
      mN = mN.add(1);
      mM = Z.ONE;
    }
    return mM.modSquare(mN);
  }
}

