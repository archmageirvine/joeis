package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114046 Numbers x such that <code>x^2 - 92*y^2 = 1</code>.
 * @author Sean A. Irvine
 */
public class A114046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114046() {
    super(new long[] {-1, 2302}, new long[] {1, 1151});
  }
}
