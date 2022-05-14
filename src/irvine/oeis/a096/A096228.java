package irvine.oeis.a096;
// manually floor at 2021-08-31 14:40

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A096228 a(n) = floor(n^2*((n-1)/n)^(n-1/2)).
 * @author Georg Fischer
 */
public class A096228 extends FloorSequence {

  /** Construct the sequence. */
  public A096228() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return mN <= 1 ? Z.ZERO : CR.valueOf(n).square().multiply(CR.valueOf(mN - 1).divide(CR.valueOf(n)).pow(CR.valueOf(n).subtract(CR.HALF))).floor();
  }

}
