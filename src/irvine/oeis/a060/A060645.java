package irvine.oeis.a060;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A060645 a(0) = 0, a(1) = 4, then a(n) = 18*a(n-1) - a(n-2).
 * @author Sean A. Irvine
 */
public class A060645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060645() {
    super(new long[] {-1, 18}, new long[] {0, 4});
  }
}
