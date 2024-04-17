package irvine.oeis.a096;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A096173 Numbers k such that k^3+1 is an odd semiprime.
 * @author Georg Fischer
 */
public class A096173 extends Sequence1 {

  private int mN;
  private int mExpon;

  /** Construct the sequence. */
  public A096173() {
    this(3);
  }

  /**
   * Generic constructor with parameters
   * @param expon exponent of n
   */
  public A096173(final int expon) {
    mN = 0;
    mExpon = expon;
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (Functions.BIG_OMEGA.l(n.pow(mExpon).add(1)) == 2) {
        return n;
      }
    }
  }
}
