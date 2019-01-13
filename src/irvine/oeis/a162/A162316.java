package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162316.
 * @author Sean A. Irvine
 */
public class A162316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162316() {
    super(new long[] {1, -3, 3}, new long[] {1, 26, 61});
  }
}
