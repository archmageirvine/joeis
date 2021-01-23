package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257890 Expansion of the g.f. (x^2-x+1)*(x^2-3*x+3)/(x-1)^6.
 * @author Sean A. Irvine
 */
public class A257890 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257890() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {3, 12, 34, 80, 166, 314});
  }
}
