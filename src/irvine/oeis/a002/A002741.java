package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.factorial.MemoryFactorial;

/**
 * A002741 Logarithmic numbers: expansion of <code>-log(1-x) e^(-x)</code>.
 * @author Sean A. Irvine
 */
public class A002741 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
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
