package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131730 <code>a(4n) =</code> n, <code>a(4n+1) = -n-1, a(4n+2) = n+1, a(4n+3) = -n</code>.
 * @author Sean A. Irvine
 */
public class A131730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131730() {
    super(new long[] {1, 1, 0, 0, -1}, new long[] {0, -1, 1, 0, 1});
  }
}
