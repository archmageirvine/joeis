package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058298 Triangle n!/(n-k), 1 &lt;= k &lt; n, read by rows.
 * @author Sean A. Irvine
 */
public class A058298 implements Sequence {

  private Z mF = Z.ONE;
  private long mN = 1;
  private long mM = 1;

  @Override
  public Z next() {
    if (++mM >= mN) {
      mF = mF.multiply(++mN);
      mM = 1;
    }
    return mF.divide(mN - mM);
  }
}
