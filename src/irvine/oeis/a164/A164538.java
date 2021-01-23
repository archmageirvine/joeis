package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164538 a(n) = 10*a(n-1) - 23*a(n-2) for n &gt; 1; a(0) = 5, a(1) = 33.
 * @author Sean A. Irvine
 */
public class A164538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164538() {
    super(new long[] {-23, 10}, new long[] {5, 33});
  }
}
