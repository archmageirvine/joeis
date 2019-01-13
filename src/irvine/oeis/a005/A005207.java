package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005207.
 * @author Sean A. Irvine
 */
public class A005207 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005207() {
    super(new long[] {1, -2, -3, 4}, new long[] {1, 2, 4, 9});
  }
}
