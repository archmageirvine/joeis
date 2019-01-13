package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100058.
 * @author Sean A. Irvine
 */
public class A100058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100058() {
    super(new long[] {-2, 1, 3}, new long[] {1, 3, 10});
  }
}
