package irvine.oeis.a054;

import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054524 Triangle T(n,k): T(n,k) = mu(k) if k divides n, T(n,k)=0 otherwise (n &gt;= 1, 1&lt;=k&lt;=n).
 * @author Sean A. Irvine
 */
public class A054524 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mN % mM == 0 ? Mobius.mobius(mM) : 0);
  }
}
