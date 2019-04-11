package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099087 Expansion of <code>1/(1 - 2*x + 2*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A099087 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099087() {
    super(new long[] {-2, 2}, new long[] {1, 2});
  }
}
