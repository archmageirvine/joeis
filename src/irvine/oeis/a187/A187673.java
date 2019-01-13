package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187673.
 * @author Sean A. Irvine
 */
public class A187673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187673() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 10, 43, 125, 290});
  }
}
