package irvine.oeis.a067;

import irvine.oeis.LinearRecurrence;

/**
 * A067900 <code>a(n) = 14*a(n-1) - a(n-2); a(0) = 0, a(1) = 8</code>.
 * @author Sean A. Irvine
 */
public class A067900 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067900() {
    super(new long[] {-1, 14}, new long[] {0, 8});
  }
}
