package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158677 Period 6: repeat [3, 4, 0, 5, 6, 3].
 * @author Sean A. Irvine
 */
public class A158677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158677() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {3, 4, 0, 5, 6, 3});
  }
}
