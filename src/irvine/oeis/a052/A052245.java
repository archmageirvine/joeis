package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052245 Expansion of <code>10*x / ((1 - x) * (1 - 10*x)^2)</code> in powers of x.
 * @author Sean A. Irvine
 */
public class A052245 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052245() {
    super(new long[] {100, -120, 21}, new long[] {0, 10, 210});
  }
}
