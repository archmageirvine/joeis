package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081898 Second binomial transform of binomial(n+4, 4).
 * @author Sean A. Irvine
 */
public class A081898 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081898() {
    super(new long[] {243, -405, 270, -90, 15}, new long[] {1, 7, 39, 193, 886});
  }
}
