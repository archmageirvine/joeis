package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228910 <code>a(n) = 8^n - 7*7^n + 21*6^n - 35*5^n + 35*4^n - 21*3^n + 7*2^n - 1</code>.
 * @author Sean A. Irvine
 */
public class A228910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228910() {
    super(new long[] {-40320, 109584, -118124, 67284, -22449, 4536, -546, 36}, new long[] {0, 0, 0, 0, 0, 0, 0, 5040});
  }
}
