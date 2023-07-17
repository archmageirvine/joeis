package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a342.A342053;

/**
 * A058786 Number of n-hedra with 2n-5 vertices or 3n-7 edges (the vertices of these are all of degree 3, except one which is of degree 4). Alternatively, the number of polyhedra with n vertices whose faces are all triangular, except one which is tetragonal.
 * @author Sean A. Irvine
 */
public class A058786 extends A342053 {

  /** Construct the sequence. */
  public A058786() {
    super(5);
  }

  private int mN = 0;

  @Override
  public Z next() {
    return a342053ColSeq(++mN, 4).coeff(mN);
  }
}
