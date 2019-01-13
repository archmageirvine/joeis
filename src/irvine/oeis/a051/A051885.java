package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051885.
 * @author Sean A. Irvine
 */
public class A051885 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051885() {
    super(new long[] {-10, 10, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
  }
}
