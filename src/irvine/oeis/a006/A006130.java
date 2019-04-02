package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006130 a(n) = a(n-1) + 3*a(n-2) for n &gt; 1, a(0) = a(1) = 1.
 * @author Sean A. Irvine
 */
public class A006130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006130() {
    super(new long[] {3, 1}, new long[] {1, 1});
  }
}

