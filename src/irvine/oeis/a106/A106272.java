package irvine.oeis.a106;

import irvine.math.z.Z;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A106272 Antidiagonal sums of number triangle A106270.
 * @author Georg Fischer
 */
public class A106272 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A106272() {
    super(0, "[[0],[-2, 4],[-1,-1],[2,-4],[1, 1]]", "1,-1", 0);
  }
}
