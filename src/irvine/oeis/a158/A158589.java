package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158589.
 * @author Sean A. Irvine
 */
public class A158589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158589() {
    super(new long[] {1, -3, 3}, new long[] {306, 1278, 2898});
  }
}
