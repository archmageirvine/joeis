package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036085 Centered cube numbers: <code>(n+1)^7 + n^7</code>.
 * @author Sean A. Irvine
 */
public class A036085 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036085() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 129, 2315, 18571, 94509, 358061, 1103479, 2920695});
  }
}
