package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135522 a(n) = 2*a(n-1) + 3*a(n-2), with a(0) = 2 and a(1) = 3.
 * @author Sean A. Irvine
 */
public class A135522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135522() {
    super(new long[] {3, 2}, new long[] {2, 3});
  }
}
