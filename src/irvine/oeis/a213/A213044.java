package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213044.
 * @author Sean A. Irvine
 */
public class A213044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213044() {
    super(new long[] {1, 1, -1, -2, -2, 2, 1, 1}, new long[] {1, 1, 2, 5, 7, 12, 22, 34});
  }
}
