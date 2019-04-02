package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168072 Expansion of (1-27x^2-108x^3)/((1-3x)^2*(1+3x+9x^2)).
 * @author Sean A. Irvine
 */
public class A168072 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168072() {
    super(new long[] {-81, 27, 0, 3}, new long[] {1, 3, -18, -135});
  }
}
