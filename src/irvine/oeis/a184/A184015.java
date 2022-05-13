package irvine.oeis.a184;
// manually floor at 2021-09-01 16:25

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A184015 n-1+ceiling(n^2/e); complement of A184014.
 * @author Georg Fischer
 */
public class A184015 extends FloorSequence {

  /** Construct the sequence. */
  public A184015() {
    super(1);
  }

  @Override
  protected Z evalCR(final long n) {
    return Z.valueOf(mN - 1).add(CR.valueOf(n).square().divide(CR.E).ceil());
  }

}
