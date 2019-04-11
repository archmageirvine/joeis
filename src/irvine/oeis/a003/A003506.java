package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003506 Triangle of denominators in Leibniz's Harmonic Triangle <code>a(n</code>,k), <code>n &gt;= 1,</code> 1&lt;=k&lt;=n.
 * @author Sean A. Irvine
 */
public class A003506 implements Sequence {

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

