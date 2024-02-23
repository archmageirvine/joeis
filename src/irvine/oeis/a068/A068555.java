package irvine.oeis.a068;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068555 Triangle read by rows in which row n contains (2i)!*(2j)!/(i!*j!*(i+j)!) for i + j = n, i = 0..n.
 * @author Sean A. Irvine
 */
public class A068555 extends Sequence0 {

  private static final MemoryFactorial F = MemoryFactorial.SINGLETON;
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return F.factorial(2 * mM).divide(F.factorial(mM)).multiply(F.factorial(2 * (mN - mM)).divide(F.factorial(mN - mM))).divide(F.factorial(mN));
  }
}

