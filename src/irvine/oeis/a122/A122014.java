package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122014.
 * @author Sean A. Irvine
 */
public class A122014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122014() {
    super(new long[] {-1, 0, 7, 0, -13, 0, 7, 0}, new long[] {1, 11, 40, 42, 179, 181, 773, 790});
  }
}
