package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198862.
 * @author Sean A. Irvine
 */
public class A198862 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198862() {
    super(new long[] {-1, 0, 0, 1}, new long[] {-1, 2, 2, 2});
  }
}
