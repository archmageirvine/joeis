package irvine.oeis.a147;
// manually interleave at 2021-11-02 15:18

import irvine.oeis.AlternatingSequence;
import irvine.oeis.recur.LinearRecurrence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A147658 (1, 2, -4, 6, -8, ...) interleaved with (3, -3, 3, -3, 3, ...).
 * @author Georg Fischer
 */
public class A147658 extends AlternatingSequence {

  /** Construct the sequence. */
  public A147658() {
    super(1, new LinearRecurrence(new long[]{-1, -2}, new long[]{2, -4}, 1), new PeriodicSequence("3,-3"));
  }
}
