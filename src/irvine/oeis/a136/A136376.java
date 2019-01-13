package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136376.
 * @author Sean A. Irvine
 */
public class A136376 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136376() {
    super(new long[] {-1, -2, 1, 2}, new long[] {1, 3, 8, 18});
  }
}
