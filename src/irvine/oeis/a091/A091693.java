package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091693 <code>(n*10^n - n + 9)/9</code>.
 * @author Sean A. Irvine
 */
public class A091693 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091693() {
    super(new long[] {-100, 220, -141, 22}, new long[] {1, 2, 23, 334});
  }
}
