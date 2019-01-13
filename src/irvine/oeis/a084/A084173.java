package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084173.
 * @author Sean A. Irvine
 */
public class A084173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084173() {
    super(new long[] {2, -3, -1, 3}, new long[] {1, 3, 5, 13});
  }
}
