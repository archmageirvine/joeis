package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002260 Triangle read by rows: T(n,k) = k for n &gt;= 1, k = 1..n.
 * @author Sean A. Irvine
 */
public class A002260 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mM);
  }
}
