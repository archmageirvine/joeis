package irvine.oeis.a276;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A276026 a(n) = Sum_{k=0..7} (n + k)^2.
 * @author Sean A. Irvine
 */
public class A276026 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276026() {
    super(new long[] {1, -3, 3}, new long[] {140, 204, 284});
  }
}
