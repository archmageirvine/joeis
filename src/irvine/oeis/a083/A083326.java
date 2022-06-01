package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083326 a(n) = 6^n - 5^n + 4^n.
 * @author Sean A. Irvine
 */
public class A083326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083326() {
    super(new long[] {120, -74, 15}, new long[] {1, 5, 27});
  }
}
