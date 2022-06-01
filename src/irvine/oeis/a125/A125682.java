package irvine.oeis.a125;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A125682 a(n) = (6^n-1)*3/5.
 * @author Sean A. Irvine
 */
public class A125682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125682() {
    super(new long[] {-6, 7}, new long[] {3, 21});
  }
}
