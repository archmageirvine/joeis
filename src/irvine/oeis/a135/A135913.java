package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135913 <code>2+4*2^n-3^n</code>.
 * @author Sean A. Irvine
 */
public class A135913 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135913() {
    super(new long[] {6, -11, 6}, new long[] {5, 7, 9});
  }
}
