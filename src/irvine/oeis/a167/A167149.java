package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167149 10000-gonal numbers: a(n) = n + 4999 * n * (n-1).
 * @author Sean A. Irvine
 */
public class A167149 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167149() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 10000});
  }
}
