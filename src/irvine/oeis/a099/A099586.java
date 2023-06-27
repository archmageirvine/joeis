package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099586 Constant term in (1+x)^n mod (1+x^4).
 * @author Sean A. Irvine
 */
public class A099586 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099586() {
    super(1, new long[] {-2, 4, -6, 4}, new long[] {1, 1, 1, 0});
  }
}
