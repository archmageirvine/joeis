package irvine.oeis.a170;

import irvine.oeis.LinearRecurrence;

/**
 * A170833.
 * @author Sean A. Irvine
 */
public class A170833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A170833() {
    super(new long[] {-16, 0, 4, 4, 0}, new long[] {4, 4, 16, 16, 76});
  }
}
