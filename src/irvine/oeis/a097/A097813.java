package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097813.
 * @author Sean A. Irvine
 */
public class A097813 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097813() {
    super(new long[] {2, -5, 4}, new long[] {1, 2, 6});
  }
}
