package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079824.
 * @author Sean A. Irvine
 */
public class A079824 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079824() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 2, 7, 12, 25, 37, 62});
  }
}
