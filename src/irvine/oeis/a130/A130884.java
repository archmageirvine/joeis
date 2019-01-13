package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130884.
 * @author Sean A. Irvine
 */
public class A130884 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130884() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 7, 35, 103});
  }
}
