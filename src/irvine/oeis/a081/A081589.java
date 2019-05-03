package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081589 Third row of <code>Pascal-(1,5,1)</code> array <code>A081580</code>.
 * @author Sean A. Irvine
 */
public class A081589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081589() {
    super(new long[] {1, -3, 3}, new long[] {1, 13, 61});
  }
}
