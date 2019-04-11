package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120071 <code>a(n) = n*(n+20)</code>.
 * @author Sean A. Irvine
 */
public class A120071 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120071() {
    super(new long[] {1, -3, 3}, new long[] {0, 21, 44});
  }
}
