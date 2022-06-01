package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164609 a(n) = 10*a(n-1) - 17*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 13.
 * @author Sean A. Irvine
 */
public class A164609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164609() {
    super(new long[] {-17, 10}, new long[] {1, 13});
  }
}
