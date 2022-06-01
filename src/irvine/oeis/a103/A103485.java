package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103485 Expansion of (7 +4*x -5*x^2 -7*x^3) / ((1-x)*(1-x^2-x^3)).
 * @author Sean A. Irvine
 */
public class A103485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103485() {
    super(new long[] {-1, 0, 1, 1}, new long[] {7, 11, 13, 17});
  }
}
