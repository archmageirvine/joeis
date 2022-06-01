package irvine.oeis.a281;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A281546 a(n) = 27*n + 2.
 * @author Sean A. Irvine
 */
public class A281546 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281546() {
    super(new long[] {-1, 2}, new long[] {2, 29});
  }
}
