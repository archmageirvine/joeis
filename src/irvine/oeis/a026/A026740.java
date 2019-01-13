package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026740.
 * @author Sean A. Irvine
 */
public class A026740 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026740() {
    super(new long[] {64, -56, 14}, new long[] {0, 0, 4});
  }
}
