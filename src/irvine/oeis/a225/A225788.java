package irvine.oeis.a225;
// manually floor at 2021-08-31 14:40

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A225788 Floor(72*n^(1/2)*(log(n))^(3/2)).
 * @author Georg Fischer
 */
public class A225788 extends FloorSequence {

  /** Construct the sequence. */
  public A225788() {
    super(0);
  }

  protected Z evalCR(final long n) {
    final CR logn = mN == 0 ? CR.ZERO : CR.valueOf(n).log();
    return mN == 0 ? Z.ZERO : CR.valueOf(72).multiply(CR.valueOf(n).sqrt()).multiply(logn.multiply(logn).multiply(logn).sqrt()).floor();
  }

}
