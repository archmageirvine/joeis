package irvine.oeis.a108;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A108299 Triangle read by rows, 0 &lt;= k &lt;= n: T(n,k) = binomial(n-[(k+1)/2],[k/2])*(-1)^[(k+1)/2].
 * @author Sean A. Irvine
 */
public class A108299 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    final long u = (mM + 1) / 2;
    final Z t = Binomial.binomial(mN - u, mM / 2);
    return (u & 1) == 0 ? t : t.negate();
  }
}

