package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174507.
 * @author Sean A. Irvine
 */
public class A174507 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174507() {
    super(new long[] {1, 0, 0, -39, 0, 0, 39, 0, 0}, new long[] {1, 5, 37, 1, 233, 1441, 1, 8885, 54757});
  }
}
