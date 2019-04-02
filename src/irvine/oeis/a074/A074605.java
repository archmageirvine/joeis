package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074605 a(n) = 3^n + 4^n.
 * @author Sean A. Irvine
 */
public class A074605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074605() {
    super(new long[] {-12, 7}, new long[] {2, 7});
  }
}
