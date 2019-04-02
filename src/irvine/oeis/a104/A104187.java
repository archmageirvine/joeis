package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104187 G.f. -(1+x^2+x^4)/((x^3+x^2+x-1)*(x-1)^2).
 * @author Sean A. Irvine
 */
public class A104187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104187() {
    super(new long[] {1, -1, 0, -2, 3}, new long[] {1, 3, 8, 18, 38});
  }
}
