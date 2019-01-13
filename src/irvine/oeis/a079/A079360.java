package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079360.
 * @author Sean A. Irvine
 */
public class A079360 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079360() {
    super(new long[] {-2, 2, 1}, new long[] {1, 5, 7});
  }
}
