package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122996 Expansion of <code>(1+6*x)/(1-x-49*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A122996 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122996() {
    super(new long[] {49, 1}, new long[] {1, 7});
  }
}
