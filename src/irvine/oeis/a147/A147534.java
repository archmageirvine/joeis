package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147534 <code>a(n)</code> is congruent to <code>(1,1,2) mod 3</code>.
 * @author Sean A. Irvine
 */
public class A147534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147534() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 1, 2, 4});
  }
}
