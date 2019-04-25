package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176387 y-values in the solution to <code>x^2-74*y^2=1</code>.
 * @author Sean A. Irvine
 */
public class A176387 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176387() {
    super(new long[] {-1, 7398}, new long[] {0, 430});
  }
}
