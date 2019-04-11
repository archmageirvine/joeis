package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206565 Expansion of <code>1/(1 - 37*x + x^2)</code>.
 * @author Sean A. Irvine
 */
public class A206565 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206565() {
    super(new long[] {-1, 37}, new long[] {1, 37});
  }
}
