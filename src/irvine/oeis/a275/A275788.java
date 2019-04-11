package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275788 <code>a(0) = 0, a(n+1) = 2*a(n) + (-1)^floor(n/3)</code>.
 * @author Sean A. Irvine
 */
public class A275788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275788() {
    super(new long[] {2, -1, 0, 2}, new long[] {0, 1, 3, 7});
  }
}
