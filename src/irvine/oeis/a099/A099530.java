package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099530 Expansion of 1/(1-x+x^4).
 * @author Sean A. Irvine
 */
public class A099530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099530() {
    super(new long[] {-1, 0, 0, 1}, new long[] {1, 1, 1, 1});
  }
}
