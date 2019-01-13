package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224425.
 * @author Sean A. Irvine
 */
public class A224425 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224425() {
    super(new long[] {-32, 64, -42, 11}, new long[] {10584, 171477, 1461051, 9546255});
  }
}
