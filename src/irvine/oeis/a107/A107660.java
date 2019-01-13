package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107660.
 * @author Sean A. Irvine
 */
public class A107660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107660() {
    super(new long[] {-9, 3, 3}, new long[] {1, 6, 21});
  }
}
