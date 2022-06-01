package irvine.oeis.a196;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A196506 a(n) = 1*3*5 + 3*5*7 + 5*7*9 + ... (n terms).
 * @author Sean A. Irvine
 */
public class A196506 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196506() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 15, 120, 435, 1128});
  }
}
