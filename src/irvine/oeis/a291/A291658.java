package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291658 a(n) is the sum of all integers from 5^n to 5^(n+1)-1.
 * @author Sean A. Irvine
 */
public class A291658 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291658() {
    super(new long[] {-125, 30}, new long[] {10, 290});
  }
}
