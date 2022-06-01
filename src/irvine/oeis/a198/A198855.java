package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198855 a(n) = 7*8^n - 1.
 * @author Sean A. Irvine
 */
public class A198855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198855() {
    super(new long[] {-8, 9}, new long[] {6, 55});
  }
}
