package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216757 a(n) = 6*a(n-1) - 9*a(n-2) + 3*a(n-3).
 * @author Sean A. Irvine
 */
public class A216757 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216757() {
    super(new long[] {3, -9, 6}, new long[] {0, -3, -15});
  }
}
