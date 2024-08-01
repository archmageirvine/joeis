package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022978 a(n) = 22-n.
 * @author Sean A. Irvine
 */
public class A022978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022978() {
    super(new long[] {-1, 2}, new long[] {22, 21});
  }
}
