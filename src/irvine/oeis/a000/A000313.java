package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

/**
 * A000313 Number of permutations of length n with 3 consecutive ascending pairs.
 * @author Sean A. Irvine
 */
public class A000313 implements Sequence {

  private int mN = -2;
  private final MemoryFactorial mF = new MemoryFactorial();

  @Override
  public Z next() {
    Z s = Z.ZERO;
    if (++mN > 1) {
      final Z b = mF.factorial(mN + 1);
      for (int k = 0; k <= mN; ++k) {
        final Z c = b.divide(mF.factorial(k));
        s = s.signedAdd((k & 1) == 0, c);
      }
    }
    return s.multiply(mN).divide(6);
  }
}
