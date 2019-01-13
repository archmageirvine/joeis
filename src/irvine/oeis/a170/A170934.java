package irvine.oeis.a170;

import irvine.oeis.LinearRecurrence;

/**
 * A170934.
 * @author Sean A. Irvine
 */
public class A170934 extends LinearRecurrence {

  /** Construct the sequence. */
  public A170934() {
    super(new long[] {-1, 1, -1, 2}, new long[] {4, 4, 5, 7});
  }
}
