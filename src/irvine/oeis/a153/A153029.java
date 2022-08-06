package irvine.oeis.a153;
// manually hygeom at 2022-08-06 19:54

import irvine.math.z.Z;
import irvine.oeis.HypergeometricSequence;

/**
 * A153029 Special values of the hypergeometric function of the type 5F0.
 * @author Georg Fischer
 */
public class A153029 extends HypergeometricSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A153029() {
    super(0, 5, 0, "[[0,-1/2],[1/2,-1/2],[1,-1/2],[3/2,-1/2],[2,-1/2],[-4]]");
  }

  @Override
  public Z next() {
    ++mN;
    return super.nextQ().ceiling();
  }
}
