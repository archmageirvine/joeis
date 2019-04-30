package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030429 <code>a(n+2) = 7*a(n+1) - 7*a(n) - 9*n; a(n+4) = 9*a(n+3) - 22*a(n+2) + 21*a(n+1) - 7*a(n)</code>.
 * @author Sean A. Irvine
 */
public class A030429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030429() {
    super(new long[] {-7, 21, -22, 9}, new long[] {1, 2, 7, 26});
  }
}
