package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105077 G.f. <code>-(x^3+5x+5)/((x^2-x+1)*(x+1)^2)</code>.
 * @author Sean A. Irvine
 */
public class A105077 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105077() {
    super(new long[] {-1, -1, 0, -1}, new long[] {-5, 0, 0, 4});
  }
}
