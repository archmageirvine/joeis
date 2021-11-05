package irvine.oeis.a167;
// manually deris2/essent at 2021-11-04

import irvine.math.z.Z;
import irvine.oeis.a002.A002370;

/**
 * A167028 Number of terms in the expansion of the determinant of a skew-symmetric matrix of order n.
 * Essentially a duplicate of A002370.
 * @author Georg Fischer
 */
public class A167028 extends A002370 {

  private int mN = 0;

  /** Construct the sequence. */
  public A167028() {
    super.next();
  }

  @Override
  public Z next() {
    return (++mN & 1) == 1 ? Z.ZERO : super.next();
  }
}
