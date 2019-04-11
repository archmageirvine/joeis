package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168458 <code>a(n) = 7 + 10*floor((n-1)/2)</code>.
 * @author Sean A. Irvine
 */
public class A168458 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168458() {
    super(new long[] {-1, 1, 1}, new long[] {7, 7, 17});
  }
}
