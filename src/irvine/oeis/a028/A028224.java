package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028224.
 * @author Sean A. Irvine
 */
public class A028224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028224() {
    super(new long[] {-7392, 3268, -533, 38}, new long[] {1, 38, 911, 17632});
  }
}
