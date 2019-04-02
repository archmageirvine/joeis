package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164311 a(n) = 12*a(n-1) - 33*a(n-2) for n &gt; 1; a(0) = 4, a(1) = 27.
 * @author Sean A. Irvine
 */
public class A164311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164311() {
    super(new long[] {-33, 12}, new long[] {4, 27});
  }
}
