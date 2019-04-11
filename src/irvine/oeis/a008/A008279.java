package irvine.oeis.a008;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008279 Triangle T(n,k) = n!/(n-k)! <code>(0 &lt;=</code> k <code>&lt;= n)</code> read by rows, giving number of permutations of n things k at a time.
 * @author Sean A. Irvine
 */
public class A008279 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mF.factorial(mN).divide(mF.factorial(mN - mM));
  }
}

