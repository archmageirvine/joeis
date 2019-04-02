package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015451 a(n) = 6*a(n-1) + a(n-2) for n &gt; 1, with a(0) = a(1) = 1.
 * @author Sean A. Irvine
 */
public class A015451 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015451() {
    super(new long[] {1, 6}, new long[] {1, 1});
  }
}
