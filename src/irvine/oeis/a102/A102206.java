package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102206 <code>a(0) = 3, a(1) = 8, a(n+2) = 4*a(n+1) - a(n) - 2</code>.
 * @author Sean A. Irvine
 */
public class A102206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102206() {
    super(new long[] {1, -5, 5}, new long[] {3, 8, 27});
  }
}
