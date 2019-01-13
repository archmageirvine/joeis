package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100041.
 * @author Sean A. Irvine
 */
public class A100041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100041() {
    super(new long[] {1, -3, 3}, new long[] {-7, -4, 3});
  }
}
