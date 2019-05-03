package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051740 Partial sums of <code>A007584</code>.
 * @author Sean A. Irvine
 */
public class A051740 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051740() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 11, 45, 125, 280});
  }
}
