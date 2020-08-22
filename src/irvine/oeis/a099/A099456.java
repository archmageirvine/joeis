package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099456 Expansion of 1/(1 - 4*x + 5*x^2).
 * @author Sean A. Irvine
 */
public class A099456 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099456() {
    super(new long[] {-5, 4}, new long[] {1, 4});
  }
}
