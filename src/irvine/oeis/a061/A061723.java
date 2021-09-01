package irvine.oeis.a061;
// manually floor at 2021-08-30 14:32

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A061723 Floor of arithmetic-geometric mean of n and 2*n - 1.
 * @author Georg Fischer
 */
public class A061723 extends FloorSequence {

  /** Construct the sequence. */
  public A061723() {
    super(0);
  }

  @Override
  protected Z evalCR(final long n) {
    return CR.valueOf(n).agm(CR.valueOf(n + n - 1)).floor();
  }
}
