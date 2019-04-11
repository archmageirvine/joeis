package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181442 Solutions <code>a(n)</code> to (r(n)-2)*(r(n)-3) <code>= 6*a(n)*(a(n)-1)</code>.
 * @author Sean A. Irvine
 */
public class A181442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181442() {
    super(new long[] {1, -1, -10, 10, 1}, new long[] {1, 2, 4, 15, 35});
  }
}
