package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026396.
 * @author Sean A. Irvine
 */
public class A026396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026396() {
    super(new long[] {-5, 5, 1}, new long[] {3, 7, 17});
  }
}
