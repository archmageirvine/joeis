package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023469 n-27.
 * @author Sean A. Irvine
 */
public class A023469 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023469() {
    super(new long[] {-1, 2}, new long[] {-27, -26});
  }
}
