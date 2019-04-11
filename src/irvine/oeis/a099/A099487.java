package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099487 Expansion of <code>(1-3x+x^2)/((1+x^2)(1-4x+x^2))</code>.
 * @author Sean A. Irvine
 */
public class A099487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099487() {
    super(new long[] {-1, 4, -2, 4}, new long[] {1, 1, 3, 14});
  }
}
