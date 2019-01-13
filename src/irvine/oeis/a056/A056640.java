package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056640.
 * @author Sean A. Irvine
 */
public class A056640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056640() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 5, 18, 42, 83});
  }
}
