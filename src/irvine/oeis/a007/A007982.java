package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007982 Number of non-Abelian metacyclic groups of order <code>2^n</code>.
 * @author Sean A. Irvine
 */
public class A007982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007982() {
    super(new long[] {0, 0, 0, -1, 1, 2, -1, -2, -1, 2, 1}, new long[] {0, 0, 2, 5, 9, 15, 22, 32, 43, 57, 72});
  }
}
