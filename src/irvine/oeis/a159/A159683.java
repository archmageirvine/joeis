package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159683 The general form of the recurrences are the <code>a(j), b(j)</code> and <code>n(j)</code> solutions of the 2 equations problem: <code>3*n(j)+1=a(j)*a(j)</code> and <code>5*n(j)+1=b(j)*b(j)</code> with positive integer numbers.
 * @author Sean A. Irvine
 */
public class A159683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159683() {
    super(new long[] {1, -63, 63}, new long[] {0, 16, 1008});
  }
}
