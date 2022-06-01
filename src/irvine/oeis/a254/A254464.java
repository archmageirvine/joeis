package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254464 a(n) = 21*2^n + 10*4^n + 15*3^n + 3*6^n + 6*5^n + 7^n + 28.
 * @author Sean A. Irvine
 */
public class A254464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254464() {
    super(new long[] {5040, -13068, 13132, -6769, 1960, -322, 28}, new long[] {84, 210, 714, 2982, 14178, 73470, 404634});
  }
}
