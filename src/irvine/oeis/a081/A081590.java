package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081590 Fourth row of <code>Pascal-(1,5,1)</code> array <code>A081580</code>.
 * @author Sean A. Irvine
 */
public class A081590 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081590() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 19, 145, 595});
  }
}
