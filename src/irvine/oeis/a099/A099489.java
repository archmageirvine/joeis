package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099489 Expansion of (1-x+x^2)/((1+x^2)(1-4x+x^2)).
 * @author Sean A. Irvine
 */
public class A099489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099489() {
    super(new long[] {-1, 4, -2, 4}, new long[] {1, 3, 11, 42});
  }
}
