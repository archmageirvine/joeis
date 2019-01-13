package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099215.
 * @author Sean A. Irvine
 */
public class A099215 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099215() {
    super(new long[] {3, -4, 4}, new long[] {1, 2, 4});
  }
}
