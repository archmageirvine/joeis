package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176900 <code>sin((2*n+5)*Pi/6)*(n+1)*2^(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A176900 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176900() {
    super(new long[] {-16, 16, -12, 4}, new long[] {1, -4, -24, -32});
  }
}
