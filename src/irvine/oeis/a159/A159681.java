package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159681 The general form of the recurrences are the a(j), b(j) and n(j) solutions of the 2 equations problem: 5*n(j)+1=a(j)*a(j) and 7*n(j)+1=b(j)*b(j) with positive integer numbers.
 * @author Sean A. Irvine
 */
public class A159681 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159681() {
    super(1, new long[] {1, -143, 143}, new long[] {0, 24, 3432});
  }
}
