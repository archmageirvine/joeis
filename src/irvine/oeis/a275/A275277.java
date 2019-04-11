package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275277 <code>a(n) = a(n-1) + 3*a(n-2) + 3*a(n-3) + a(n-4),</code> where <code>a(0) = a(1) = a(2) = a(3) = 1</code>.
 * @author Sean A. Irvine
 */
public class A275277 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275277() {
    super(new long[] {1, 3, 3, 1}, new long[] {1, 1, 1, 1});
  }
}
