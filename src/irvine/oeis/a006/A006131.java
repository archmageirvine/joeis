package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006131 <code>a(n) = a(n-1) + 4*a(n-2), a(0) = a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A006131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006131() {
    super(new long[] {4, 1}, new long[] {1, 1});
  }
}

