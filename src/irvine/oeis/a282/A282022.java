package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282022 Start with 1; multiply alternately by 3 and 4.
 * @author Sean A. Irvine
 */
public class A282022 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282022() {
    super(new long[] {12, 0}, new long[] {1, 3});
  }
}
