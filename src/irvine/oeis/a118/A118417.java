package irvine.oeis.a118;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A118417 a(n) = (2*n + 1) * 2^(n + 1).
 * @author Sean A. Irvine
 */
public class A118417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118417() {
    super(new long[] {-4, 4}, new long[] {2, 12});
  }
}
