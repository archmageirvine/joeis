package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100531.
 * @author Sean A. Irvine
 */
public class A100531 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100531() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 3, 7, 13, 21});
  }
}
