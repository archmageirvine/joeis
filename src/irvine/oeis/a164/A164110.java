package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164110 a(n) = 12*a(n-1) - 34*a(n-2) for n &gt; 1; a(0) = 5, a(1) = 36.
 * @author Sean A. Irvine
 */
public class A164110 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164110() {
    super(new long[] {-34, 12}, new long[] {5, 36});
  }
}
