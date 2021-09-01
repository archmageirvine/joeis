package irvine.oeis.a257;
// manually floor at 2021-09-01 13:58

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A257854 a(n) = 2 * n^4 - floor(2^(1/4) * n)^4.
 * @author Georg Fischer
 */
public class A257854 extends FloorSequence {
  /** Construct the sequence */
  public A257854() {
    super(0);
  }

  @Override
  protected Z evalCR(final long n) {
    return Z.valueOf(n).pow(4).multiply2().subtract(CR.TWO.pow(CR.FOUR.inverse()).multiply(CR.valueOf(n)).floor().pow(4));
  }

}
