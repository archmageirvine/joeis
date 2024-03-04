package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099279 Squares of A001076.
 * @author Sean A. Irvine
 */
public class A099279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099279() {
    super(new long[] {-1, 17, 17}, new long[] {0, 1, 16});
  }
}
