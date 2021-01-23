package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025581 Triangle T(n, k) = n-k, 0 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A025581 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = ++mN;
    }
    return Z.valueOf(mM);
  }
}
