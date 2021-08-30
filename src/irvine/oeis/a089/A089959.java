package irvine.oeis.a089;
// manually floor at 2021-08-30 14:32

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A089959 a(n) = floor(1/(f(n) - f(n)^2)) with f(n) = frac(n*(sqrt(5) - 1)/2) (fractional part).
 * @author Georg Fischer
 */
public class A089959 extends FloorSequence {

  /** Construct the sequence */
  public A089959() {
    super(1);
  }

  protected Z evalCR(final long n) {
    final CR mF = CR.valueOf(n).divide(CR.PHI).frac();
    return CR.ONE.divide(mF.multiply(CR.ONE.subtract(mF))).floor();
  }

}
