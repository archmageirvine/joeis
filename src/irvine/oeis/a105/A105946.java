package irvine.oeis.a105;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A105946 a(n) = C(n+3,3) * C(n+5,5).
 * @author Sean A. Irvine
 */
public class A105946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105946() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 24, 210, 1120, 4410, 14112, 38808, 95040, 212355});
  }
}
