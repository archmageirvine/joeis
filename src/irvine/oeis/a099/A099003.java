package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099003.
 * @author Sean A. Irvine
 */
public class A099003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099003() {
    super(new long[] {-2, 3}, new long[] {1, 16});
  }
}
