package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164544 a(n) = 2*a(n-1) + 7*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 7.
 * @author Sean A. Irvine
 */
public class A164544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164544() {
    super(new long[] {7, 2}, new long[] {1, 7});
  }
}
