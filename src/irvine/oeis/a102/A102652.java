package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102652 <code>a(n) = 4 * floor(24*2^n/15) = 4*A077854(n)</code>.
 * @author Sean A. Irvine
 */
public class A102652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102652() {
    super(new long[] {-2, 3, -3, 3}, new long[] {4, 12, 24, 48});
  }
}
