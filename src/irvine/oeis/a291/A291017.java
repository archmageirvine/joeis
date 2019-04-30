package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291017 p-INVERT of <code>(1,1,1,1,1,...)</code>, where p(S) <code>= 1 - 5</code> S + S^2.
 * @author Sean A. Irvine
 */
public class A291017 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291017() {
    super(new long[] {-7, 7}, new long[] {5, 29});
  }
}
