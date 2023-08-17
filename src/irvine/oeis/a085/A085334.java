package irvine.oeis.a085;
// manually robots/union2 at 2023-08-15 15:43

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a003.A003072;
import irvine.oeis.a003.A003325;
import irvine.oeis.a003.A003327;
import irvine.oeis.a003.A003328;
import irvine.oeis.a003.A003329;

/**
 * A085334 Numbers which are neither sums of 2, 3, 4, 5 or that of 6 nonnegative cubes.
 * @author Georg Fischer
 */
public class A085334 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A085334() {
    // Remaining set of all natural numbers if union of A003325, A003072, A003327, A003328 and A003329 sets were deleted
    super(1, new A000027(), new UnionSequence(new A003325(), new A003072(), new A003327(), new A003328(), new A003329()));
  }
}
