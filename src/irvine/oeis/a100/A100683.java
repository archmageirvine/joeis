package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100683 <code>a(n) = a(n-1) + a(n-2) + a(n-3); a(0) = -1, a(1) = 2, a(2) = 2</code>.
 * @author Sean A. Irvine
 */
public class A100683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100683() {
    super(new long[] {1, 1, 1}, new long[] {-1, 2, 2});
  }
}
