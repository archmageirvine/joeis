package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099271.
 * @author Sean A. Irvine
 */
public class A099271 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099271() {
    super(new long[] {-1, 14, 14}, new long[] {0, 1, 13});
  }
}
