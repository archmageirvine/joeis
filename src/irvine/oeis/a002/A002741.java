package irvine.oeis.a002;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002741 Logarithmic numbers: expansion of the e.g.f. -log(1-x) * e^(-x).
 * @author Sean A. Irvine
 */
public class A002741 extends Sequence0 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    final Z nf = mF.factorial(mN);
    for (int k = 0; k < mN; ++k) {
      s = s.signedAdd((k & 1) == 0, nf.divide(mF.factorial(k)).divide(mN - k));
    }
    return s;
  }
}
