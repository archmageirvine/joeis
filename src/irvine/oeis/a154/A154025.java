package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154025.
 * @author Sean A. Irvine
 */
public class A154025 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154025() {
    super(new long[] {-1, 64}, new long[] {0, 8});
  }
}
