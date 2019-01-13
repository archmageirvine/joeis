package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100255.
 * @author Sean A. Irvine
 */
public class A100255 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100255() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 25, 144, 484});
  }
}
