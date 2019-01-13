package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100212.
 * @author Sean A. Irvine
 */
public class A100212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100212() {
    super(new long[] {8, -8, 4, 0, -2, 2}, new long[] {0, 0, 0, 0, 8, 20});
  }
}
