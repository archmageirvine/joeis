package irvine.oeis.a147;
// manually interleave at 2021-11-02 15:18

import irvine.oeis.LinearRecurrence;
import irvine.oeis.PrependSequence;

/**
 * A147657 (1, -2, 3,...) interleaved with (1, 2, -2, 2, -2,...).
 * @author Georg Fischer
 */
public class A147657 extends PrependSequence {

  /** Construct the sequence. */
  public A147657() {
    super(new LinearRecurrence(new long[] {-1, 0, -2, 0}, new long[] {1, -2, -2, 2}), 1, 2);
  }
}
