package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213042 Convolution of <code>(1,0,2,0,3,0,...)</code> and <code>(1,0,0,2,0,0,3,0,0,...)</code>; i.e., <code>(A027656(n))</code> and <code>(A175676(n+2))</code>.
 * @author Sean A. Irvine
 */
public class A213042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213042() {
    super(new long[] {-1, 0, 2, 2, -1, -4, -1, 2, 2, 0}, new long[] {1, 0, 2, 2, 3, 4, 7, 6, 11, 12});
  }
}
