package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254467 a(n) = 15*4^n + 70*2^n + 35*3^n + 5^(n+1) + 6^n + 126.
 * @author Sean A. Irvine
 */
public class A254467 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254467() {
    super(new long[] {-720, 1764, -1624, 735, -175, 21}, new long[] {252, 462, 1122, 3432, 12342, 49632});
  }
}
