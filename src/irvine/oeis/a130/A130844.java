package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130844.
 * @author Sean A. Irvine
 */
public class A130844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130844() {
    super(new long[] {1, -1, 1, 2}, new long[] {0, 3, 5, 17});
  }
}
