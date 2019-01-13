package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099903.
 * @author Sean A. Irvine
 */
public class A099903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099903() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {2, 36, 216, 800, 2250, 5292});
  }
}
