package irvine.oeis.a030;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030237 Catalan's triangle with right border removed (n &gt; 0, 0 &lt;= k &lt; n).
 * @author Sean A. Irvine
 */
public class A030237 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN + mM, mN).multiply(mN - mM + 1).divide(mN + 1);
  }
}
