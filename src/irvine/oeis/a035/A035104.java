package irvine.oeis.a035;

import irvine.oeis.LinearRecurrence;

/**
 * A035104 First differences give (essentially) A028242.
 * @author Sean A. Irvine
 */
public class A035104 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035104() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 4, 9, 13});
  }
}
