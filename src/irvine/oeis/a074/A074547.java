package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074547 a(n) = 3^n + 4^n + 5^n.
 * @author Sean A. Irvine
 */
public class A074547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074547() {
    super(new long[] {60, -47, 12}, new long[] {3, 12, 50});
  }
}
