package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084267.
 * @author Sean A. Irvine
 */
public class A084267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084267() {
    super(new long[] {-1, 3, -3, 2, -3, 3, -2, 3, -3, 2, -3, 3}, new long[] {1, 2, 4, 7, 11, 17, 24, 33, 44, 57, 72, 89});
  }
}
