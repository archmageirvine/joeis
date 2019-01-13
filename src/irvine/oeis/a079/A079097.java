package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079097.
 * @author Sean A. Irvine
 */
public class A079097 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079097() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {1, 1, 3, 4, 5, 9});
  }
}
