package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123890 G.f.: <code>x/((1-x^2)^5-1+x)</code>.
 * @author Sean A. Irvine
 */
public class A123890 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123890() {
    super(new long[] {1, 0, -5, 0, 10, 0, -10, 0, 5}, new long[] {1, 5, 25, 115, 525, 2385, 10825, 49120, 222875});
  }
}
