package irvine.oeis.a056;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056151 Distribution of maximum inversion table entry.
 * @author Sean A. Irvine
 */
public class A056151 implements Sequence {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mM).pow(mN - mM).multiply(MemoryFactorial.SINGLETON.factorial(mM))
      .subtract(Z.valueOf(mM - 1).pow(mN - mM + 1).multiply(MemoryFactorial.SINGLETON.factorial(mM - 1)));
  }
}

