package irvine.oeis.a060;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A060195 a(n) = 8^(n-1)*(2^n-1).
 * @author Sean A. Irvine
 */
public class A060195 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060195() {
    super(new long[] {-128, 24}, new long[] {1, 24});
  }
}
