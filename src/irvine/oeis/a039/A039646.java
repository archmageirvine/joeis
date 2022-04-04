package irvine.oeis.a039;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039646 Third column of Jabotinsky-triangle A038455 related to A006963.
 * @author Sean A. Irvine
 */
public class A039646 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 3; k <= mN; ++k) {
      sum = sum.add(Stirling.firstKind(k, 3).multiply(Binomial.binomial(2 * mN, mN - k)).multiply(mF.factorial(mN - 1)).divide(mF.factorial(k - 1)));
    }
    return sum;
  }
}
