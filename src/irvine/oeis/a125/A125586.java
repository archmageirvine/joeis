package irvine.oeis.a125;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A125586 a(n) = 2^(2n-1) - (n+2)*3^(n-2).
 * @author Sean A. Irvine
 */
public class A125586 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125586() {
    super(1, new long[] {36, -33, 10}, new long[] {1, 4, 17});
  }
}
