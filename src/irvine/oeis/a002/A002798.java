package irvine.oeis.a002;

import irvine.oeis.LinearRecurrence;

/**
 * A002798 a(n) = a(n-2)+a(n-3)-a(n-5).
 * @author Sean A. Irvine
 */
public class A002798 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002798() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {18, 45, 69, 96, 120});
  }
}
