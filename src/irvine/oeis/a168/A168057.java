package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168057 Expansion of (1+8x^2+8x^3)/((1-2x)^2*(1+2x+4x^2)).
 * @author Sean A. Irvine
 */
public class A168057 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168057() {
    super(new long[] {-16, 8, 0, 2}, new long[] {1, 2, 12, 40});
  }
}
