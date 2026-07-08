package irvine.oeis.a156;
// manually 2026-07-07/holos at 2026-07-07 18:20

import irvine.oeis.ZeroSpacedSequence;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A156431 Number of n X n arrays of squares of integers, symmetric under 90-degree rotation, with all rows summing to 2.
 * @author Georg Fischer
 */
public class A156431 extends ZeroSpacedSequence {

  /** Construct the sequence. */
  public A156431() {
    super(2, new HolonomicRecurrence(1, "[[0],[4,-6,2],[1,-1],[-1,2],[-1]]", "1,1,2", 1, 0).skip(1), 1);
  }
}
