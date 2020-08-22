package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098931 a(0) = 1, a(n) = 1 + 2*3 + 4*5 + 6*7 + ... + (2n)*(2n+1) for n &gt; 0.
 * @author Sean A. Irvine
 */
public class A098931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098931() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 7, 27, 69});
  }
}
