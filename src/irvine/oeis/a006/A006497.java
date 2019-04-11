package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006497 <code>a(n) = 3*a(n-1) + a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A006497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006497() {
    super(new long[] {1, 3}, new long[] {2, 3});
  }
}

