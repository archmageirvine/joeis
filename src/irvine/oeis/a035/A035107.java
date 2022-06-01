package irvine.oeis.a035;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A035107 First differences give (essentially) A028242.
 * @author Sean A. Irvine
 */
public class A035107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035107() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {3, 9, 17, 29, 44});
  }
}
