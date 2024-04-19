package irvine.oeis.a043;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A043302 Triangular table of 2^n *(n+k)! / ((n-k)! * k! * 4^k).
 * @author Sean A. Irvine
 */
public class A043302 extends Sequence1 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Functions.FACTORIAL.z(mN + mM).shiftLeft(mN - 2L * mM).divide(Functions.FACTORIAL.z(mM)).divide(Functions.FACTORIAL.z(mN - mM));
  }
}

