package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081587 Third row of <code>Pascal-(1,4,1)</code> array <code>A081579</code>.
 * @author Sean A. Irvine
 */
public class A081587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081587() {
    super(new long[] {1, -3, 3}, new long[] {1, 11, 46});
  }
}
