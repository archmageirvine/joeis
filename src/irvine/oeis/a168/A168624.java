package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168624 a(n) = 1 - 10^n + 100^n.
 * @author Sean A. Irvine
 */
public class A168624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168624() {
    super(new long[] {1000, -1110, 111}, new long[] {1, 91, 9901});
  }
}
