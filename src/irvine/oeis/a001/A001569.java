package irvine.oeis.a001;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

/**
 * A001569.
 * @author Sean A. Irvine
 */
public class A001569 implements Sequence {

  private int mN = -1;
  private final MemoryFactorial mF = new MemoryFactorial();

  @Override
  public Z next() {
    Z s = Z.ZERO;
    final Z n = mF.factorial(++mN);
    for (int k = 0; k <= mN; ++k) {
      final Z t = Stirling.secondKind(mN, k).multiply(n).divide(mF.factorial(k));
      s = s.signedAdd((k & 1) == 0, t);
    }
    return s;
  }
}
