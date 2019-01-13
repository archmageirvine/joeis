package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248848.
 * @author Sean A. Irvine
 */
public class A248848 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248848() {
    super(new long[] {-1, 9, 2, 9}, new long[] {1, 9, 82, 765});
  }
}
