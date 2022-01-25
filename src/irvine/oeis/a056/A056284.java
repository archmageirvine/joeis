package irvine.oeis.a056;
// manually triselect

import irvine.math.z.Z;
import irvine.oeis.a087.A087854;
import irvine.oeis.triangle.TriangleSelector;

/**
 * A056284 Number of n-bead necklaces with exactly four different colored beads.
 * @author Georg Fischer
 */
public class A056284 extends TriangleSelector {

  private int mN = 0;

  /** Construct the sequence. */
  public A056284() {
    super(1, new A087854(), 1, n -> new int[] {n, 4});
  }

  public Z next() {
    final Z result = super.next();
    return ++mN <= 3 ? Z.ZERO : result;
  }
}
