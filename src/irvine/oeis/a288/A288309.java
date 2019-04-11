package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288309 <code>a(n) = 2*a(n-1) + 2*a(n-2) - 3*a(n-3),</code> where <code>a(0) = 2, a(1) = 4, a(2) = 8</code>.
 * @author Sean A. Irvine
 */
public class A288309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288309() {
    super(new long[] {-3, 2, 2}, new long[] {2, 4, 8});
  }
}
