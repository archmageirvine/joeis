package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106389 Numbers j such that 6j^2 + 6j <code>+ 1 =</code> 13k.
 * @author Sean A. Irvine
 */
public class A106389 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106389() {
    super(new long[] {-1, 1, 1}, new long[] {1, 11, 14});
  }
}
