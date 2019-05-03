package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081583 Third row of <code>Pascal-(1,2,1)</code> array <code>A081577</code>.
 * @author Sean A. Irvine
 */
public class A081583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081583() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 10, 46, 136});
  }
}
