package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195163 1000-gonal numbers: a(n) = n*(499*n - 498).
 * @author Sean A. Irvine
 */
public class A195163 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195163() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 1000});
  }
}
