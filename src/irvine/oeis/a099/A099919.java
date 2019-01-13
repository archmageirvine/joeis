package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099919.
 * @author Sean A. Irvine
 */
public class A099919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099919() {
    super(new long[] {-1, -3, 5}, new long[] {0, 2, 10});
  }
}
