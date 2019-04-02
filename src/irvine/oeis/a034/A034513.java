package irvine.oeis.a034;

import irvine.oeis.LinearRecurrence;

/**
 * A034513 a(n) = 1^n + 3^n + 9^n.
 * @author Sean A. Irvine
 */
public class A034513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034513() {
    super(new long[] {27, -39, 13}, new long[] {3, 13, 91});
  }
}
