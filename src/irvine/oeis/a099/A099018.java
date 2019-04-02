package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099018 Duplicate of A033484.
 * @author Sean A. Irvine
 */
public class A099018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099018() {
    super(new long[] {-2, 3}, new long[] {1, 4});
  }
}
