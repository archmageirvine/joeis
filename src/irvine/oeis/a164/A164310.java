package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164310 a(n) = 6*a(n-1) - 6*a(n-2) for n &gt; 1; a(0) = 4, a(1) = 15.
 * @author Sean A. Irvine
 */
public class A164310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164310() {
    super(new long[] {-6, 6}, new long[] {4, 15});
  }
}
