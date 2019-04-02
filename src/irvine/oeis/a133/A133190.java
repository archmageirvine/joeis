package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133190 a(n) = 2a(n-1) - a(n-2) + 2a(n-3).
 * @author Sean A. Irvine
 */
public class A133190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133190() {
    super(new long[] {2, -1, 2}, new long[] {1, 3, 3});
  }
}
