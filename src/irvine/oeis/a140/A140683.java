package irvine.oeis.a140;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A140683 a(n) = 3*(-1)^(n+1)*2^n - 1.
 * @author Sean A. Irvine
 */
public class A140683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140683() {
    super(new long[] {2, -1}, new long[] {-4, 5});
  }
}
