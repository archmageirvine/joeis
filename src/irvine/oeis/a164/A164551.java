package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164551 a(n) = 10*a(n-1)-19*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 9.
 * @author Sean A. Irvine
 */
public class A164551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164551() {
    super(new long[] {-19, 10}, new long[] {1, 9});
  }
}
