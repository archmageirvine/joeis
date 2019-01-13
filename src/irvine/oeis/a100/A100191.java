package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100191.
 * @author Sean A. Irvine
 */
public class A100191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100191() {
    super(new long[] {-2, 3, 3}, new long[] {1, 6, 19});
  }
}
