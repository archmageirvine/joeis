package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135370 <code>a(1)=1;</code> then if n even <code>a(n) = n + a(n-1)</code>, if n odd <code>a(n) = 2*n + a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A135370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135370() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 3, 9, 13, 23});
  }
}
