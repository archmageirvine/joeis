package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254463 a(n) = 15*2^n + 6*4^n + 10*3^n + 3*5^n + 6^n + 21.
 * @author Sean A. Irvine
 */
public class A254463 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254463() {
    super(new long[] {-720, 1764, -1624, 735, -175, 21}, new long[] {56, 126, 378, 1386, 5778, 26226});
  }
}
