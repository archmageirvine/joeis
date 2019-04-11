package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006054 <code>a(n) = 2*a(n-1) + a(n-2) - a(n-3),</code> with <code>a(0) = a(1) = 0, a(2) = 1</code>.
 * @author Sean A. Irvine
 */
public class A006054 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006054() {
    super(new long[] {-1, 1, 2}, new long[] {0, 0, 1});
  }
}

