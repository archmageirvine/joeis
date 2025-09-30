package irvine.oeis.a187;
// manually 2025-09-04

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A187535 Central Lah numbers: a(n) = A105278(2*n,n) = A008297(2*n,n).
 * @author Georg Fischer
 */
public class A187535 extends HolonomicRecurrence implements DirectSequence {

  /** Construct the sequence. */
  public A187535() {
    super(0, "[[0],[-4, 16,-16],[0, 1]]", "[1, 2]", 0);
  }

  @Override
  public Z a(final Z n) {
    return Functions.LAH.z(n.multiply2(), n);
  }

  @Override
  public Z a(final int n) {
    return Functions.LAH.z(2L * n, n);
  }

}
