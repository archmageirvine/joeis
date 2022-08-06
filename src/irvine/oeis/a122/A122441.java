package irvine.oeis.a122;
// manually hygeom at 2022-08-04 21:37

import irvine.math.z.Z;
import irvine.oeis.HypergeometricSequence;

/**
 * A122441 Expansion of 2*(sqrt(1+8x)-3)/(sqrt(1+8x)-5).
 * @author Georg Fischer
 */
public class A122441 extends HypergeometricSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A122441() {
    super(0, 2, 1, "[[1,-1],[0, 1],[0,-1],[-2]]");
  }

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? super.next() : super.next().negate();
  }
}
