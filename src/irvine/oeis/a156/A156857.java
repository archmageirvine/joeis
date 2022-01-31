package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156857 Expansion of (1+2*x)/(1+x+4*x^2)^2.
 * @author Sean A. Irvine
 */
public class A156857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156857() {
    super(new long[] {-16, -8, -9, -2}, new long[] {1, 0, -9, 10});
  }
}
