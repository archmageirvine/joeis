package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100189.
 * @author Sean A. Irvine
 */
public class A100189 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100189() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 6, 27, 92, 245});
  }
}
