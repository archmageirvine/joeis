package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084634.
 * @author Sean A. Irvine
 */
public class A084634 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084634() {
    super(new long[] {-2, 7, -9, 5}, new long[] {1, 2, 4, 9});
  }
}
