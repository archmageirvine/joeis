package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168390 <code>a(n) = 1 + 8*floor(n/2)</code>.
 * @author Sean A. Irvine
 */
public class A168390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168390() {
    super(new long[] {-1, 1, 1}, new long[] {1, 9, 9});
  }
}
