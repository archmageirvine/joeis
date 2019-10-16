package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a079.A079126;

/**
 * A026840 Triangular array T read by rows: <code>T(n,k) =</code> number of partitions of n into distinct parts <code>&lt;=</code> k, for <code>k=1,2,...n</code>.
 * @author Sean A. Irvine
 */
public class A026840 extends A079126 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
