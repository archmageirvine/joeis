package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025788 Expansion of 1/((1-x)(1-x^7)(1-x^12)).
 * @author Sean A. Irvine
 */
public class A025788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025788() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, -1, 1, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 4, 4, 4, 4, 4, 5});
  }
}
