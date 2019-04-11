package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061550 <code>a(n) = (2n+1)*(2n+3)*(2n+5)</code>.
 * @author Sean A. Irvine
 */
public class A061550 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061550() {
    super(new long[] {-1, 4, -6, 4}, new long[] {15, 105, 315, 693});
  }
}
