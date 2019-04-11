package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083858 Expansion of <code>x/(1 - 3*x - 6*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A083858 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083858() {
    super(new long[] {6, 3}, new long[] {0, 1});
  }
}
