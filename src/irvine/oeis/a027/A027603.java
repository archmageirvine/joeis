package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027603 a(n) = n^3 + (n+1)^3 + (n+2)^3 + (n+3)^3.
 * @author Sean A. Irvine
 */
public class A027603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027603() {
    super(new long[] {-1, 4, -6, 4}, new long[] {36, 100, 224, 432});
  }
}
