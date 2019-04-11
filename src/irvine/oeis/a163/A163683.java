package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163683 <code>a(n) = n^2*(2*n + 5)</code>.
 * @author Sean A. Irvine
 */
public class A163683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163683() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 7, 36, 99});
  }
}
