package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282023 Start with 1; multiply alternately by 4 and 3.
 * @author Sean A. Irvine
 */
public class A282023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282023() {
    super(new long[] {12, 0}, new long[] {1, 4});
  }
}
