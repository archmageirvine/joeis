package irvine.oeis.a170;

import irvine.oeis.LinearRecurrence;

/**
 * A170955.
 * @author Sean A. Irvine
 */
public class A170955 extends LinearRecurrence {

  /** Construct the sequence. */
  public A170955() {
    super(new long[] {-10, 11}, new long[] {1, 91});
  }
}
