package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097992.
 * @author Sean A. Irvine
 */
public class A097992 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097992() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 1, 2});
  }
}
