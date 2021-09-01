package irvine.oeis.a184;
// manually floor at 2021-08-24 08:51

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A184336 a(n) = n + floor((3*n)^(1/3) - 2/3).
 * @author Georg Fischer
 */
public class A184336 extends FloorSequence {
  /** Construct the sequence. */
  public A184336() {
    super(1);
  }

  @Override
  protected Z evalCR(final long n) {
    return Z.valueOf(n).add(CR.valueOf(n).multiply(CR.THREE).pow(CR.ONE_THIRD).subtract(CR.TWO.divide(CR.THREE)).floor());
  }
}
