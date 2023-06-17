package irvine.oeis.a000;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000313 Number of permutations of length n with 3 consecutive ascending pairs.
 * @author Sean A. Irvine
 */
public class A000313 extends AbstractSequence {

  /** Construct the sequence. */
  public A000313() {
    super(1);
  }

  private int mN = -2;
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

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
