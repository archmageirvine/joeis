package irvine.oeis.a125;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A125837 a(n) = 6*(8^n - 1)/7.
 * @author Sean A. Irvine
 */
public class A125837 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125837() {
    super(1, new long[] {-8, 9}, new long[] {0, 6});
  }
}
