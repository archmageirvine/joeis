package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164549 a(n) = 4*a(n-1)+2*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 6.
 * @author Sean A. Irvine
 */
public class A164549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164549() {
    super(new long[] {2, 4}, new long[] {1, 6});
  }
}
