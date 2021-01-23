package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018902 a(n+2) = 5*a(n+1) - 3*a(n).
 * @author Sean A. Irvine
 */
public class A018902 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018902() {
    super(new long[] {-3, 5}, new long[] {1, 4});
  }
}
