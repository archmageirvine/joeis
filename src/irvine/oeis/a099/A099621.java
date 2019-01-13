package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099621.
 * @author Sean A. Irvine
 */
public class A099621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099621() {
    super(new long[] {-12, -5, 6}, new long[] {0, 1, 6});
  }
}
