package irvine.oeis.a039;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039692 Jabotinsky-triangle related to A039647.
 * @author Sean A. Irvine
 */
public class A039692 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    Z sum = Z.ZERO;
    for (int k = mM; k <= mN; ++k) {
      sum = sum.signedAdd(((k + mM) & 1) == 0,
        mF.factorial(mN).divide(mF.factorial(k)).multiply(Stirling.firstKind(k, mM)).multiply(Binomial.binomial(k, mN - k)));
    }
    return sum;
  }
}
