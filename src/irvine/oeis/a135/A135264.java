package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135264 a(n) = 3*A132357(n).
 * @author Sean A. Irvine
 */
public class A135264 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135264() {
    super(new long[] {3, -1, 0, 3}, new long[] {3, 12, 42, 123});
  }
}
