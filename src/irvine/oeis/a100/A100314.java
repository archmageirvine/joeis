package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100314.
 * @author Sean A. Irvine
 */
public class A100314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100314() {
    super(new long[] {2, -5, 4}, new long[] {1, 4, 8});
  }
}
