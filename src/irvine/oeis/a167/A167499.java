package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167499 a(n) = n*(n+3)/2 + 6.
 * @author Sean A. Irvine
 */
public class A167499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167499() {
    super(new long[] {1, -3, 3}, new long[] {6, 8, 11});
  }
}
