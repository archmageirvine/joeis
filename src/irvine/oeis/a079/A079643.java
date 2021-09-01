package irvine.oeis.a079;
// manually floor at 2021-09-01 16:25

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A079643 a(n) = floor(n/floor(sqrt(n))).
 * @author Georg Fischer
 */
public class A079643 extends FloorSequence {
  /** Construct the sequence. */
  public A079643() {
    super(1);
  }

  @Override
  protected Z evalCR(final long n) {
    return Z.valueOf(n).divide(CR.valueOf(n).sqrt().floor());
  }

}
