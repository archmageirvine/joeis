package irvine.oeis.a222;

import irvine.oeis.LinearRecurrence;

/**
 * A222308.
 * @author Sean A. Irvine
 */
public class A222308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A222308() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 6, 34, 114, 285, 602, 1127});
  }
}
