package irvine.oeis.a004;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A004191 Expansion of 1/(1 - 12*x + x^2).
 * @author Sean A. Irvine
 */
public class A004191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A004191() {
    super(new long[] {-1, 12}, new long[] {1, 12});
  }
}
