package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099782.
 * @author Sean A. Irvine
 */
public class A099782 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099782() {
    super(new long[] {2, -16, 8}, new long[] {1, 4, 16});
  }
}
