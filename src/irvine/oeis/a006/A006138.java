package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006138 <code>a(n) = a(n-1) + 3*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A006138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006138() {
    super(new long[] {3, 1}, new long[] {1, 2});
  }
}

