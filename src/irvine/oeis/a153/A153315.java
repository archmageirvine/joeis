package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153315 Denominators of continued fraction convergents to <code>sqrt(5/4)</code>.
 * @author Sean A. Irvine
 */
public class A153315 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153315() {
    super(new long[] {-1, 0, 18, 0}, new long[] {1, 8, 17, 144});
  }
}
