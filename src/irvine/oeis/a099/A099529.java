package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099529 Expansion of <code>(1+x)^2/((1+x)^2+x^3)</code>.
 * @author Sean A. Irvine
 */
public class A099529 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099529() {
    super(new long[] {-1, -1, -2}, new long[] {1, 0, 0});
  }
}
