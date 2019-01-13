package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158769.
 * @author Sean A. Irvine
 */
public class A158769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158769() {
    super(new long[] {1, -3, 3}, new long[] {1, 79, 313});
  }
}
