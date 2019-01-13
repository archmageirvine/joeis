package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289419.
 * @author Sean A. Irvine
 */
public class A289419 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289419() {
    super(new long[] {-4, 34, -86, 91, -46, 11}, new long[] {1, 11, 75, 410, 1975, 8778});
  }
}
