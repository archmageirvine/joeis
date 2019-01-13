package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158070.
 * @author Sean A. Irvine
 */
public class A158070 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158070() {
    super(new long[] {1, -3, 3}, new long[] {0, 66, 260});
  }
}
