package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168075 Expansion of (1+27x^2-54x^3)/((1+3x)^2*(1-3x+9 x^2)).
 * @author Sean A. Irvine
 */
public class A168075 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168075() {
    super(new long[] {-81, -27, 0, -3}, new long[] {1, -3, 36, -189});
  }
}
