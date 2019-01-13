package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271830.
 * @author Sean A. Irvine
 */
public class A271830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271830() {
    super(new long[] {-1, 2, -2, 2, -2, 2}, new long[] {3, 2, 1, 4, 5, 6});
  }
}
