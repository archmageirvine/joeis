package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164543 a(n) = 10*a(n-1) - 17*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 17.
 * @author Sean A. Irvine
 */
public class A164543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164543() {
    super(new long[] {-17, 10}, new long[] {1, 17});
  }
}
