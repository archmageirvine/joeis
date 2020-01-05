package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176333 Expansion of <code>(1-3*x)/(1-4*x+9*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A176333 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176333() {
    super(new long[] {-9, 4}, new long[] {1, 1});
  }
}
