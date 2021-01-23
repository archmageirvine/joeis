package irvine.oeis.a034;

import irvine.oeis.LinearRecurrence;

/**
 * A034659 a(n) = (11^n + 1)/2.
 * @author Sean A. Irvine
 */
public class A034659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034659() {
    super(new long[] {-11, 12}, new long[] {1, 6});
  }
}
