package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164315.
 * @author Sean A. Irvine
 */
public class A164315 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164315() {
    super(new long[] {-1, 0, 1, 1}, new long[] {1, 2, 4, 6});
  }
}
