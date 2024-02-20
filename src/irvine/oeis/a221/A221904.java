package irvine.oeis.a221;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A221904 a(n) = 9^n + 10^n.
 * @author Sean A. Irvine
 */
public class A221904 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221904() {
    super(new long[] {-90, 19}, new long[] {2, 19});
  }
}
