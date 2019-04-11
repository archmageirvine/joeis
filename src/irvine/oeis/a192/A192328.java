package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192328 Numbers of the form <code>20*k+7</code> which are three times a square.
 * @author Sean A. Irvine
 */
public class A192328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192328() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {27, 147, 507, 867, 1587});
  }
}
