package irvine.oeis.a121;
// manually floor at 2021-08-31 12:46

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A121349 a(n) = round(Pi*2^(n-1)).
 * @author Georg Fischer
 */
public class A121349 extends FloorSequence {
  /** Construct the sequence. */
  public A121349() {
    super(0);
  }

  protected Z evalCR(final long n) {
    return mN <= 0 ? Z.ONE : CR.PI.multiply(CR.TWO.pow(CR.valueOf(n).subtract(CR.ONE))).round();
  }

}
