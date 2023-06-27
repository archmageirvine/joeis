package irvine.oeis.a006;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A006904 a(n) = a(n-1) + 2*a(n-2) + (-1)^n.
 * @author Sean A. Irvine
 */
public class A006904 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006904() {
    super(4, new long[] {2, 3, 0}, new long[] {1, 1, 4});
  }
}

