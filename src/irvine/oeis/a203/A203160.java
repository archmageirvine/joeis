package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203160 (n-1)-st elementary symmetric function of the first n terms of <code>(2,3,1,2,3,1,2,3,1,..</code>.)=A010882.
 * @author Sean A. Irvine
 */
public class A203160 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203160() {
    super(new long[] {-36, 0, 0, 12, 0, 0}, new long[] {1, 5, 11, 28, 96, 132});
  }
}
