package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088002 Expansion of <code>(1+x^2)/(1+x^2+x^5)</code>.
 * @author Sean A. Irvine
 */
public class A088002 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088002() {
    super(new long[] {-1, 0, 0, -1, 0}, new long[] {1, 0, 0, 0, 0});
  }
}
