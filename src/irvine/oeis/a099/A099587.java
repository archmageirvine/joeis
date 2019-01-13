package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099587.
 * @author Sean A. Irvine
 */
public class A099587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099587() {
    super(new long[] {-2, 4, -6, 4}, new long[] {0, 1, 2, 3});
  }
}
