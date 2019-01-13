package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163197.
 * @author Sean A. Irvine
 */
public class A163197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163197() {
    super(new long[] {-1, 20, -35, -35, 20}, new long[] {-1, 1, 27, 540, 9800});
  }
}
