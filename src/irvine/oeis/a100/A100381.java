package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100381.
 * @author Sean A. Irvine
 */
public class A100381 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100381() {
    super(new long[] {8, -12, 6}, new long[] {0, 0, 4});
  }
}
