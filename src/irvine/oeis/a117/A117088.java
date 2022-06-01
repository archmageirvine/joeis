package irvine.oeis.a117;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A117088 a(n) = (11*5^n - 7)/4.
 * @author Sean A. Irvine
 */
public class A117088 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117088() {
    super(new long[] {-5, 6}, new long[] {1, 12});
  }
}
