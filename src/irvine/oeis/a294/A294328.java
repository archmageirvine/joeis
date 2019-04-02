package irvine.oeis.a294;

import irvine.oeis.LinearRecurrence;

/**
 * A294328 a(n) = ((9*n + 8)*10^n - 8)/81.
 * @author Sean A. Irvine
 */
public class A294328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A294328() {
    super(new long[] {100, -120, 21}, new long[] {0, 2, 32});
  }
}
