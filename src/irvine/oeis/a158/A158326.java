package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158326 a(n) = 484*n + 1.
 * @author Sean A. Irvine
 */
public class A158326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158326() {
    super(1, new long[] {-1, 2}, new long[] {485, 969});
  }
}
