package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130625.
 * @author Sean A. Irvine
 */
public class A130625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130625() {
    super(new long[] {2, -3, 3}, new long[] {1, 4, 7});
  }
}
