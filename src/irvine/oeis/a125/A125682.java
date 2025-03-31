package irvine.oeis.a125;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A125682 a(n) = 3*(6^n - 1)/5.
 * @author Sean A. Irvine
 */
public class A125682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125682() {
    super(1, new long[] {-6, 7}, new long[] {3, 21});
  }
}
