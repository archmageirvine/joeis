package irvine.oeis.a079;
// manually floor at 2021-09-01 16:25

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A079632 a(n) = floor(n/floor(sqrt(n)))-floor(sqrt(n)).
 * @author Georg Fischer
 */
public class A079632 extends FloorSequence {

  /** Construct the sequence. */
  public A079632() {
    super(1);
  }

  @Override
  protected Z evalCR(final long n) {
    final Z n2f = CR.valueOf(n).sqrt().floor();
    return Z.valueOf(n).divide(n2f).subtract(n2f);
  }

}
