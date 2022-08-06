package irvine.oeis.a194;
// manually hygeom/hygeo at 2022-08-05 08:42

import irvine.math.z.Z;
import irvine.oeis.HypergeometricSequence;

/**
 * A194589 a(n) = A194588(n) - A005043(n); complementary Riordan numbers.
 * @author Georg Fischer
 */
public class A194589 extends HypergeometricSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A194589() {
    super(0, 3, 2, "[[1,-1/2],[0,-1],[3/2,-1/2],[1],[2,-1],[4]]");
  }

  @Override
  public Z next() {
    ++mN;
    if (mN <= 1) {
      super.next();
      return Z.ZERO;
    } else {
      return super.next();
    }
  }
}
