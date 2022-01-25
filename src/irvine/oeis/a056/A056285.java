package irvine.oeis.a056;
// manually triselect

import irvine.math.z.Z;
import irvine.oeis.a087.A087854;
import irvine.oeis.triangle.TriangleSelector;

/**
 * A056285 Number of n-bead necklaces with exactly five different colored beads.
 * @author Georg Fischer
 */
public class A056285 extends TriangleSelector {

  private int mN = 0;

  /** Construct the sequence. */
  public A056285() {
    super(1, new A087854(), 1, n -> new int[] {n, 5});
  }

  public Z next() {
    final Z result = super.next();
    return ++mN <= 4 ? Z.ZERO : result;
  }
}
