package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159683 The general form of the recurrences are the a(j), b(j) and n(j) solutions of the 2 equations problem: 3*n(j)+1=a(j)*a(j) and 5*n(j)+1=b(j)*b(j) with positive integer numbers.
 * @author Sean A. Irvine
 */
public class A159683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159683() {
    super(new long[] {1, -63, 63}, new long[] {0, 16, 1008});
  }
}
