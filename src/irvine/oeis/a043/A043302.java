package irvine.oeis.a043;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A043302 Triangular table of 2^n *(n+k)! / ((n-k)! * k! * 4^k).
 * @author Sean A. Irvine
 */
public class A043302 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mF.factorial(mN + mM).shiftLeft(mN - 2 * mM).divide(mF.factorial(mM)).divide(mF.factorial(mN - mM));
  }
}

