package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120471 a(n) = 6 * A015518(n).
 * @author Sean A. Irvine
 */
public class A120471 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120471() {
    super(new long[] {3, 2}, new long[] {0, 6});
  }
}
