package irvine.oeis.a342;
// manually andiv 2023-01-11 22:52

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a003.A003043;

/**
 * A342631 Number of Hamiltonian paths (or Gray codes) on n-cube with the origin as the starting node, up to a permutation of the coordinates.
 * @author Georg Fischer
 */
public class A342631 extends AbstractSequence {

  private final A003043 mSeq1 = new A003043();
  private int mN;

  /** Construct the sequence. */
  public A342631() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return mSeq1.next().divide(Functions.FACTORIAL.z(mN));
  }
}
