package irvine.oeis.a088;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A088924 Number of "9ish numbers" with n digits.
 * @author Sean A. Irvine
 */
public class A088924 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088924() {
    super(new long[] {-90, 19}, new long[] {1, 18});
  }
}
