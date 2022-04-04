package irvine.oeis.a046;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046792 Triangle of numbers where k-th row contains (ij)!/(i!j!) with i+j = k+1, 1 &lt;= i &lt;= k.
 * @author Sean A. Irvine
 */
public class A046792 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mF.factorial(mM * (mN + 1 - mM)).divide(mF.factorial(mM)).divide(mF.factorial(mN + 1 - mM));
  }
}

