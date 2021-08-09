package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191010 a(n) = (n*4^(n+1) + (6*4^(n+1)+(-1)^n)/5)/5.
 * @author Sean A. Irvine
 */
public class A191010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191010() {
    super(new long[] {-16, -8, 7}, new long[] {1, 7, 41});
  }
}
