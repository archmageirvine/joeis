package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130578.
 * @author Sean A. Irvine
 */
public class A130578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130578() {
    super(new long[] {-1, 1, 1, -3, 3}, new long[] {0, 0, 1, 3, 6});
  }
}
