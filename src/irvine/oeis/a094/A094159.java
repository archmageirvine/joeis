package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094159 3 times hexagonal numbers: a(n) = 3*n*(2*n-1).
 * @author Sean A. Irvine
 */
public class A094159 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094159() {
    super(new long[] {1, -3, 3}, new long[] {0, 3, 18});
  }
}
