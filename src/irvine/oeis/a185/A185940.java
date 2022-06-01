package irvine.oeis.a185;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A185940 a(n) = 1 - 2^(n+1) + 3^(n+2).
 * @author Sean A. Irvine
 */
public class A185940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185940() {
    super(new long[] {6, -11, 6}, new long[] {24, 74, 228});
  }
}
