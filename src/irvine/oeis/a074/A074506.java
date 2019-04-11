package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074506 <code>a(n) = 1^n + 3^n + 4^n</code>.
 * @author Sean A. Irvine
 */
public class A074506 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074506() {
    super(new long[] {12, -19, 8}, new long[] {3, 8, 26});
  }
}
