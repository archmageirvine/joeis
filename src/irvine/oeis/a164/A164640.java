package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164640 a(n) = 8*a(n-2) for n &gt; 2; a(1) = 1, a(2) = 6.
 * @author Sean A. Irvine
 */
public class A164640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164640() {
    super(new long[] {8, 0}, new long[] {1, 6});
  }
}
