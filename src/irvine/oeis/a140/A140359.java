package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140359 <code>a(n) = 2*a(n-1) + a(n-2) - 2*a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A140359 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140359() {
    super(new long[] {-2, 1, 2}, new long[] {1, 1, 6});
  }
}
