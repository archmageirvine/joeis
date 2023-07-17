package irvine.oeis.a152;

import irvine.math.z.Z;
import irvine.oeis.a160.A160449;

/**
 * A152612 Number of isomorphism classes of n-fold coverings of a connected graph with Betti number 3.
 * @author Sean A. Irvine
 */
public class A152612 extends A160449 {

  /** Construct the sequence. */
  public A152612() {
    super(1);
  }

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 3);
  }
}
