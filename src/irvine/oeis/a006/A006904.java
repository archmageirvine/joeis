package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006904 <code>a(n) = a(n-1) + 2*a(n-2) + (-1)^n</code>.
 * @author Sean A. Irvine
 */
public class A006904 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006904() {
    super(new long[] {2, 3, 0}, new long[] {1, 1, 4});
  }
}

