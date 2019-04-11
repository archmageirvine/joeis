package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123957 G.f.: <code>x^4/( (2*x+1) * (2*x^3+x^2-2*x+1))</code>.
 * @author Sean A. Irvine
 */
public class A123957 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123957() {
    super(new long[] {-4, -4, 3, 0}, new long[] {0, 0, 0, 1});
  }
}
