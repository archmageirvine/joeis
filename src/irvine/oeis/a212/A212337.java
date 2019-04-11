package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212337 Expansion of <code>1/(1-4*x+3*x^2)^2</code>.
 * @author Sean A. Irvine
 */
public class A212337 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212337() {
    super(new long[] {-9, 24, -22, 8}, new long[] {1, 8, 42, 184});
  }
}
