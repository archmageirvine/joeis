package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029549 a(n + 3) = 35*a(n + 2) - 35*a(n + 1) + a(n), with a(0) = 0, a(1) = 6, a(2) = 210.
 * @author Sean A. Irvine
 */
public class A029549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029549() {
    super(new long[] {1, -35, 35}, new long[] {0, 6, 210});
  }
}
