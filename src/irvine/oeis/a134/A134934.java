package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134934 a(n) = (14*n+1)^2.
 * @author Sean A. Irvine
 */
public class A134934 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134934() {
    super(new long[] {1, -3, 3}, new long[] {1, 225, 841});
  }
}
