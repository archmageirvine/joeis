package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267035.
 * @author Sean A. Irvine
 */
public class A267035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267035() {
    super(new long[] {-10000, 0, 10001, 0}, new long[] {1, 11, 10000, 111111});
  }
}
