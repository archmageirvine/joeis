package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099524 Expansion of 1/(1-5*x-x^3).
 * @author Sean A. Irvine
 */
public class A099524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099524() {
    super(new long[] {1, 0, 5}, new long[] {1, 5, 25});
  }
}
