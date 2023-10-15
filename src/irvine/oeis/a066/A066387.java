package irvine.oeis.a066;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066387 Triangle T(n,m) (1&lt;=m&lt;=n) giving number of maps f:N -&gt; N such that f^m(X)=X+n for all natural numbers X.
 * @author Timothy Rolfe
 * @author Sean A. Irvine
 */
public class A066387 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mN % mM == 0 ? MemoryFactorial.SINGLETON.factorial(mN).divide(MemoryFactorial.SINGLETON.factorial(mN / mM)) : Z.ZERO;
  }
}

