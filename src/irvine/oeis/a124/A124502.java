package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124502 <code>a(1)=a(2)=1</code>; thereafter, <code>a(n+1) = a(n) + a(n-1) + 1</code> if n is a multiple of <code>5,</code> otherwise <code>a(n+1) = a(n) + a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A124502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124502() {
    super(new long[] {-1, -1, 1, 0, 0, 1, 1}, new long[] {1, 1, 2, 3, 5, 9, 14});
  }
}
