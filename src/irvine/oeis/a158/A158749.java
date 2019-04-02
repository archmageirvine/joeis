package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158749 n*9^n.
 * @author Sean A. Irvine
 */
public class A158749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158749() {
    super(new long[] {-81, 18}, new long[] {0, 9});
  }
}
