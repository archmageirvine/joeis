package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135263 a(n) = 2*A132357(n).
 * @author Sean A. Irvine
 */
public class A135263 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135263() {
    super(new long[] {3, -1, 0, 3}, new long[] {2, 8, 28, 82});
  }
}
