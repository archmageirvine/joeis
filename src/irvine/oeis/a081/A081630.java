package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081630 <code>2-(-3)^n</code>.
 * @author Sean A. Irvine
 */
public class A081630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081630() {
    super(new long[] {3, -2}, new long[] {1, 5});
  }
}
