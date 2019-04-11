package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106526 Values of y in <code>x^2 - 49 =</code> 2*y^2.
 * @author Sean A. Irvine
 */
public class A106526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106526() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {4, 6, 14, 30, 40, 84});
  }
}
