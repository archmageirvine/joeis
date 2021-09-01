package irvine.oeis.a185;
// manually floor at 2021-09-01 16:25

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A185603 a(n) = floor(floor(n^(5/2))^(1/2)); complement of A185604.
 * @author Georg Fischer
 */
public class A185603 extends FloorSequence {
  /** Construct the sequence */
  public A185603() {
    super(1);
  }

  @Override
  protected Z evalCR(final long n) {
    return CR.valueOf(CR.valueOf(n).pow(5).sqrt().floor()).sqrt().floor();
  }

}
