package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141291 a(n) = 4*a(n-1) + 2*n-1.
 * @author Sean A. Irvine
 */
public class A141291 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141291() {
    super(new long[] {4, -9, 6}, new long[] {0, 1, 7});
  }
}
