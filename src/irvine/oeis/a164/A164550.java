package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164550 a(n) = 6*a(n-1)-3*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 7.
 * @author Sean A. Irvine
 */
public class A164550 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164550() {
    super(new long[] {-3, 6}, new long[] {1, 7});
  }
}
