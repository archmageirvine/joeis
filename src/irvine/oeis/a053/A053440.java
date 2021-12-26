package irvine.oeis.a053;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053440.
 * @author Sean A. Irvine
 */
public class A053440 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mF.factorial(mM + 1).multiply(Stirling.secondKind(mN + 2, mM + 2));
  }
}

