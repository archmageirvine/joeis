package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003506 Triangle of denominators in Leibniz's Harmonic Triangle a(n,k), n &gt;= 1, 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A003506 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Binomial.binomial(mN, mM).multiply(mM);
  }
}

