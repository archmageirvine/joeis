package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099784.
 * @author Sean A. Irvine
 */
public class A099784 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099784() {
    super(new long[] {2, -4, -4}, new long[] {1, -2, 4});
  }
}
