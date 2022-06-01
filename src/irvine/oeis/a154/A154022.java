package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154022 a(n) = 5*A097780(n-2).
 * @author Sean A. Irvine
 */
public class A154022 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154022() {
    super(new long[] {-1, 25}, new long[] {0, 5});
  }
}
