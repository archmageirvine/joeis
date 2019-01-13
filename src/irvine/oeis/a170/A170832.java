package irvine.oeis.a170;

import irvine.oeis.LinearRecurrence;

/**
 * A170832.
 * @author Sean A. Irvine
 */
public class A170832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A170832() {
    super(new long[] {-9, 0, 3, 3, 0}, new long[] {3, 3, 9, 9, 33});
  }
}
