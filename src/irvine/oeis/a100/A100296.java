package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100296.
 * @author Sean A. Irvine
 */
public class A100296 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100296() {
    super(new long[] {-1, 2, 4}, new long[] {1, 6, 25});
  }
}
