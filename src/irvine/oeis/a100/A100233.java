package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100233.
 * @author Sean A. Irvine
 */
public class A100233 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100233() {
    super(new long[] {-1, -3, 5}, new long[] {1, 3, 17});
  }
}
