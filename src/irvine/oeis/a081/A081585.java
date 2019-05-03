package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081585 Third row of <code>Pascal-(1,3,1)</code> array <code>A081578</code>.
 * @author Sean A. Irvine
 */
public class A081585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081585() {
    super(new long[] {1, -3, 3}, new long[] {1, 9, 33});
  }
}
