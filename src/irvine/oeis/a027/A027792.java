package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027792 a(n) = 7*(n+1)*binomial(n+3,7).
 * @author Sean A. Irvine
 */
public class A027792 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027792() {
    super(4, new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {35, 336, 1764, 6720, 20790, 55440, 132132, 288288, 585585});
  }
}
