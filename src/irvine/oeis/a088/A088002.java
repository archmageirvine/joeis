package irvine.oeis.a088;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A088002 Expansion of (1+x^2)/(1+x^2+x^5).
 * @author Sean A. Irvine
 */
public class A088002 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088002() {
    super(new long[] {-1, 0, 0, -1, 0}, new long[] {1, 0, 0, 0, 0});
  }
}
