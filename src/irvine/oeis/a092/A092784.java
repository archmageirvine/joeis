package irvine.oeis.a092;
// manually floor at 2021-09-01 16:25

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A092784 [round(n * Pi)-round(2 * n)].
 * @author Georg Fischer
 */
public class A092784 extends FloorSequence {

  /** Construct the sequence. */
  public A092784() {
    super(1);
  }

  @Override
  protected Z evalCR(final long n) {
    return CR.valueOf(n).multiply(CR.PI).round().subtract(2 * n);
  }

}
