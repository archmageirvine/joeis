package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038164 G.f.: 1/((1-x)*(1-x^2))^4.
 * @author Sean A. Irvine
 */
public class A038164 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038164() {
    super(new long[] {-1, 4, -2, -12, 17, 8, -28, 8, 17, -12, -2, 4}, new long[] {1, 4, 14, 36, 85, 176, 344, 624, 1086, 1800, 2892, 4488});
  }
}
