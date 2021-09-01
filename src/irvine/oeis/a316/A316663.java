package irvine.oeis.a316;
// manually floor at 2021-08-31 14:40

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A316663 Floor(sqrt((2*n)^(n+1))).
 * @author Georg Fischer
 */
public class A316663 extends FloorSequence {

  /** Construct the sequence. */
  public A316663() {
    super(0);
  }

  protected Z evalCR(final long n) {
    return mN == 0 ? Z.ZERO : CR.valueOf(2 * n).pow(CR.valueOf(mN + 1)).sqrt().floor();
  }

}
