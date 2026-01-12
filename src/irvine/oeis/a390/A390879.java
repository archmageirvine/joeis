package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a237.A237271;

/**
 * A390879 Triangle read by rows: T(n,k) = A237271(k)*(n-k+1), 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A390879 extends Sequence1 {

  private final A237271 mS = new A237271();
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mS.a(mM).multiply(mN - mM + 1);
  }
}

