package irvine.oeis.a127;
// manually floor at 2021-09-01 16:25

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A127695 Floor( 2*(2*n+1)^n*sinh(1/2) ) - (2*n+2)^n + (2*n)^n.
 * @author Georg Fischer
 */
public class A127695 extends FloorSequence {

  /** Construct the sequence. */
  public A127695() {
    super(0);
  }

  @Override
  protected Z evalCR(final long n) {
    return CR.valueOf(Z.TWO.multiply(Z.valueOf(2 * mN + 1).pow(n))).multiply(CR.HALF.sinh()).floor()
        .subtract(Z.valueOf(2 * mN + 2).pow(n))
        .add(Z.valueOf(2 * n).pow(n));
  }

}
