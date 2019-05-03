package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049681 <code>a(n) = (L(2*n) - L(n))/2</code>, where <code>L=A000032 (the</code> Lucas sequence).
 * @author Sean A. Irvine
 */
public class A049681 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049681() {
    super(new long[] {1, -2, -3, 4}, new long[] {0, 1, 2, 7});
  }
}
