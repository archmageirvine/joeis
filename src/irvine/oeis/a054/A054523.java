package irvine.oeis.a054;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054523 Triangle read by rows: T(n,k) = phi(n/k) if k divides n, T(n,k)=0 otherwise (n &gt;= 1, 1 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A054523 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mN % mM == 0 ? Euler.phi(Z.valueOf(mN / mM)) : Z.ZERO;
  }
}
