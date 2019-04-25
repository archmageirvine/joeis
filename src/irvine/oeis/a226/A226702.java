package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226702 Positive solutions <code>y/5</code> of the Pell equation <code>x^2 - 61*y^2 = -4</code>.
 * @author Sean A. Irvine
 */
public class A226702 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226702() {
    super(new long[] {-1, 1523}, new long[] {1, 1522});
  }
}
