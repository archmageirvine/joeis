package irvine.oeis.a185;
// manually floor at 2021-09-01 16:25

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A185548 a(n) = floor(floor(n^(5/2))^(2/3)).
 * @author Georg Fischer
 */
public class A185548 extends FloorSequence {
  /** Construct the sequence. */
  public A185548() {
    super(1);
  }

  @Override
  protected Z evalCR(final long n) {
    return CR.valueOf(CR.valueOf(n).pow(5).sqrt().floor()).pow(CR.TWO.divide(CR.THREE)).floor();
  }

}
