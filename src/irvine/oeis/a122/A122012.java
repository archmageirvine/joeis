package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122012 G.f.: <code>x^2*(3+3*x-2*x^2)/ ( (x^2-x-1) * (x^2+x-1))</code>.
 * @author Sean A. Irvine
 */
public class A122012 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122012() {
    super(new long[] {-1, 0, 3, 0}, new long[] {0, 3, 3, 7});
  }
}
