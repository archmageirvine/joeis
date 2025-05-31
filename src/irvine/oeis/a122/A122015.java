package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122015 Expansion of -x * (21*x^7+65*x^6+77*x^5+39*x^4-17*x^3-38*x^2-11*x-1) / ((x+1) * (x^3+x^2-1) * (x^4+2*x^3+x^2+x-1)).
 * @author Sean A. Irvine
 */
public class A122015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122015() {
    super(1, new long[] {-1, -4, -6, -4, 1, 4, 3, 0}, new long[] {1, 11, 41, 54, 129, 256, 529, 1083});
  }
}
