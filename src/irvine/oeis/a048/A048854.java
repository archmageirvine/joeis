package irvine.oeis.a048;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.a046.A046521;

/**
 * A048854 Triangle read by rows. A generalization of unsigned Lah numbers, called L[4,1].
 * @author Sean A. Irvine
 */
public class A048854 extends A046521 {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM).multiply(mF.factorial(mN)).divide(mF.factorial(mM));
  }
}

