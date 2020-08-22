package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074579 a(n) = 6^n + 8^n + 9^n.
 * @author Sean A. Irvine
 */
public class A074579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074579() {
    super(new long[] {432, -174, 23}, new long[] {3, 23, 181});
  }
}
