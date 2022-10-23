package irvine.oeis.a054;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054522 Triangle T(n,k): T(n,k) = phi(k) if k divides n, T(n,k)=0 otherwise (n &gt;= 1, 1&lt;=k&lt;=n). T(n,k) = number of elements of order k in cyclic group of order n.
 * @author Sean A. Irvine
 */
public class A054522 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mN % mM == 0 ? Euler.phi(Z.valueOf(mM)) : Z.ZERO;
  }
}
