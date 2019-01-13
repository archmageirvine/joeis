package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130750.
 * @author Sean A. Irvine
 */
public class A130750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130750() {
    super(new long[] {2, -3, 3}, new long[] {1, 3, 8});
  }
}
