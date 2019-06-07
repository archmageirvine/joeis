package irvine.oeis.a196;

import irvine.oeis.LinearRecurrence;

/**
 * A196506 <code>a(n) = 1*3*5 + 3*5*7 + 5*7*9 + ... (n</code> terms).
 * @author Sean A. Irvine
 */
public class A196506 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196506() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 15, 120, 435, 1128});
  }
}
