package irvine.oeis.a056;
// manually triselect

import irvine.math.z.Z;
import irvine.oeis.a087.A087854;
import irvine.oeis.triangle.TriangleSelector;

/**
 * A056283 Number of n-bead necklaces with exactly three different colored beads.
 * @author Georg Fischer
 */
public class A056283 extends TriangleSelector {

  private int mN = 0;

  /** Construct the sequence. */
  public A056283() {
    super(1, new A087854(), 1, n -> new int[] {n, 3});
  }

  @Override
  public Z next() {
    final Z result = super.next();
    return ++mN <= 2 ? Z.ZERO : result;
  }
}
