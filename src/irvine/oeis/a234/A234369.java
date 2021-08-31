package irvine.oeis.a234;
// manually floor at 2021-08-31 14:40

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A234369 Floor(AGM(1, triangular(n))), where AGM denotes the arithmetic-geometric mean.
 * agm(1, n*(n+1)/2)
 * @author Georg Fischer
 */
public class A234369 extends FloorSequence {
  /** Construct the sequence */
  public A234369() {
    super(0);
  }

  protected Z evalCR(final long n) {
    return mN == 0 ? Z.ZERO : CR.ONE.agm(CR.valueOf(n).multiply(CR.valueOf(mN + 1)).divide(CR.TWO)).floor();
  }

}
