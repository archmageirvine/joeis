package irvine.oeis.a119;
// manually hygeom at 2022-08-04 21:37

import irvine.math.z.Z;
import irvine.oeis.HypergeometricSequence;

/**
 * A119359 Central coefficients of number triangle A119326.
 * @author Georg Fischer
 */
public class A119359 extends HypergeometricSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A119359() {
    super(0, 4, 3, "[[-1/2,-1/2],[1/2,-1/2],[1,-1/2],[0,-1/2],[1/2],[1/2],[1],[1]]");
  }

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? super.next().subtract(1) : super.next();
  }
}
