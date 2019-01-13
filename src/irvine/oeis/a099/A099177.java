package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099177.
 * @author Sean A. Irvine
 */
public class A099177 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099177() {
    super(new long[] {-4, -4, 4, 2}, new long[] {0, 1, 2, 8});
  }
}
