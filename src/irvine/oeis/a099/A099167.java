package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099167.
 * @author Sean A. Irvine
 */
public class A099167 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099167() {
    super(new long[] {-3, -2, 4}, new long[] {1, 4, 15});
  }
}
