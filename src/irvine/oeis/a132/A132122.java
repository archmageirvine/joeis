package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132122 a(n) = n * (n+1)^2 * (3*n^2 + 4*n + 2) / 12.
 * @author Sean A. Irvine
 */
public class A132122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132122() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 3, 33, 164, 550, 1455});
  }
}
