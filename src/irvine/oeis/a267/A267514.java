package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267514.
 * @author Sean A. Irvine
 */
public class A267514 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267514() {
    super(new long[] {-10, 1, 0, 0, 0, 0, 0, 10}, new long[] {1, 10, 101, 1010, 10101, 101010, 1010100, 10101001});
  }
}
