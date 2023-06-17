package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A007318 Pascal's triangle read by rows: C(n,k) = binomial(n,k) = n!/(k!*(n-k)!), 0 &lt;= k &lt;= n. Studied by scholars in many countries long before Pascal (see Comments).
 * @author Sean A. Irvine
 */
public class A007318 extends AbstractSequence {

  /** Construct the sequence. */
  public A007318() {
    super(0);
  }

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN, mM);
  }
}
