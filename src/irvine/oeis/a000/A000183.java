package irvine.oeis.a000;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a061.A061702;

/**
 * A000183 Number of discordant permutations of length n.
 * @author Sean A. Irvine
 */
public class A000183 extends AbstractSequence {

  /** Construct the sequence. */
  public A000183() {
    super(1);
  }

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    if (++mN > 3) {
      for (int m = 0; m <= mN; ++m) {
        final Z t = mF.factorial(mN - m).multiply(A061702.t(mN, m));
        s = s.signedAdd((m & 1) == 0, t);
      }
    }
    return s;
  }
}
