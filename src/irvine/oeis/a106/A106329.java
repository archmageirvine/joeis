package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106329 Numbers k such that k^2 = 8*j^2 <code>+ 9</code>.
 * @author Sean A. Irvine
 */
public class A106329 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106329() {
    super(new long[] {-1, 6}, new long[] {3, 9});
  }
}
