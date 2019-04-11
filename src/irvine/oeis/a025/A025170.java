package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025170 G.f.: <code>1/(1+2x+9x^2)</code>.
 * @author Sean A. Irvine
 */
public class A025170 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025170() {
    super(new long[] {-9, -2}, new long[] {1, -2});
  }
}
