package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158386 a(n) = 676*n + 1.
 * @author Sean A. Irvine
 */
public class A158386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158386() {
    super(1, new long[] {-1, 2}, new long[] {677, 1353});
  }
}
