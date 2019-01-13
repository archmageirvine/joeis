package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187326.
 * @author Sean A. Irvine
 */
public class A187326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187326() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 0, 2, 3, 6});
  }
}
